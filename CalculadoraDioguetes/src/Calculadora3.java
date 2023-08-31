import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora3 extends JFrame implements ActionListener, MouseListener{

    
    private JTextField visor;
    private JLabel tipo;
    private JButton calcZone[], escudos, euros, mais, menos, igual;
    private Container cont;
    private JPanel escudosEuros, displayMain, display , teclado, bIgual;

    
    Calculadora3(){
        
            
            // zona norte
            
            // 1º linha
            
            display = new JPanel(new FlowLayout());
            
            visor = new JTextField(9);
            visor.setText("0");
            visor.setHorizontalAlignment(JTextField.RIGHT);
            visor.addMouseListener(this);
            
            display.add(visor);
            
            tipo = new JLabel("euros");
            display.add(tipo);
            
            
            // 2º linha
            escudosEuros = new JPanel(new FlowLayout());
            
            escudos = new JButton("escudos");
            escudosEuros.add(escudos);
            escudos.addActionListener(this);
            
            euros = new JButton("euros");
            escudosEuros.add(euros);
            euros.addActionListener(this);
            
            // adiciona 1º e 2º linha à zona norte
            
            displayMain = new JPanel(new GridLayout(2,1));
            
            displayMain.add(display);
            displayMain.add(escudosEuros);
            
            // zona centro
            
            teclado = new JPanel(new GridLayout(3,4));
            
            calcZone = new JButton[10];
            for(int i=1; i<=8; i++){
                
                calcZone[i] = new JButton(""+i);
                teclado.add(calcZone[i]);
                calcZone[i].setMnemonic(i);
                calcZone[i].addActionListener(this);
            }
            
            
            mais = new JButton("+");
            teclado.add(mais);
            //mais.setMnemonic('+'); para não aparecer no ecra
            mais.addActionListener(this);
            
            calcZone[9] = new JButton("9");
            teclado.add(calcZone[9]);
            calcZone[9].setMnemonic(9);
            calcZone[9].addActionListener(this);
            
            
            calcZone[0] = new JButton("0");
            teclado.add(calcZone[0]);
            calcZone[0].setMnemonic(0);
            calcZone[0].addActionListener(this);
            
            menos = new JButton("-");
            teclado.add(menos);
            menos.setMnemonic('-');
            //menos.addActionListener(this); para não aparecer no ecra
        
            //Zona South
            
            bIgual = new JPanel(new FlowLayout());
            
            igual = new JButton("=");
            bIgual.add(igual);
            igual.addActionListener(this);
            
        // usar o conteiner para visualizar
            
            cont = getContentPane(); // Obtém o content pane da applet
            cont.setLayout (new BorderLayout());
            
            cont.add(displayMain, "North");
            cont.add(teclado, "Center");
            cont.add(bIgual,"South");
        }
    
    
    public static void main (String[] args){
        
        Frame f = new Calculadora3(); 
        f.setSize (300, 300);
        f.setVisible(true);
        }
    
    
    public void actionPerformed(ActionEvent e) {
        
        //System.out.println(((JButton)e.getSource()).getText());
        
        float temp, resultado=0;
        String valor, valor1 ="", valor2= "";
        Boolean operacao=null;     //soma true
                                    //subtracao false
    
        if( e.getSource().equals(escudos)){
            
            tipo.setText( "esc" );
            temp = Float.parseFloat(( visor.getText()) );
            temp *= 200;
            visor.setText( "" + temp );
        }
        
        
        if( e.getSource().equals(euros)){
            
            tipo.setText( "euros" );
            temp = Float.parseFloat( (visor.getText()) );
            temp /= 200;
            visor.setText("" + temp);
        }
        
            
            switch (((JButton)e.getSource()).getText().charAt(0)) { // getText ir buscar a string do nome do butunn e o charAt vai a possicao...
            
            case '1' :
                System.out.println("entrou 1");
                valor = visor.getText();
                System.out.println(valor);
                valor=valor.concat("1");
                System.out.println(valor);
                visor.setText(valor);
                break;
                
            case '2' :
                
                valor = visor.getText();
                valor=valor.concat("2");
                //System.out.println(valor);
                visor.setText(valor);
                
                break;
                
            case '3' :
                
                valor = visor.getText();
                valor=valor.concat("3");
                //System.out.println(valor);
                visor.setText(valor);
                
                break;
            
            case '4' :
                
                valor = visor.getText();
                valor=valor.concat("4");
                //System.out.println(valor);
                visor.setText(valor);
                
                break;
                
            case '5' :
                
                valor = visor.getText();
                valor=valor.concat("5");
                //System.out.println(valor);
                visor.setText(valor);
                
                break;
                
            case '6' :
                
                valor = visor.getText();
                valor=valor.concat("6");
                //System.out.println(valor);
                visor.setText(valor);
                break;
                
            case '7' :
                
                valor = visor.getText();
                valor=valor.concat("7");
                //System.out.println(valor);
                visor.setText(valor);
                break;

            
            case '8' :
                
                valor = visor.getText();
                valor=valor.concat("8");
                //System.out.println(valor);
                visor.setText(valor);
                break;

            
            case '9' :
                
                valor = visor.getText();
                valor=valor.concat("9");
                //System.out.println(valor);
                visor.setText(valor);
                break;
                
            case '+' :
                
                
                valor1 = visor.getText();
                visor.setText(valor1);
                visor.setText("");    
                
                operacao=true;
                System.out.println(valor1+"----"+operacao);
                break;
                
            case '-' :
                
                valor2 = visor.getText();
                System.out.println(""+valor2);
                visor.setText(valor2);
                visor.setText("");
                System.out.println(valor2+"----"+operacao);
                operacao=false;
                
                break;
                
            case '=' :
                
                System.out.println("li teclado");
                valor = visor.getText();
                System.out.println(""+valor+"..."+valor1+"-----"+valor2+"--"+operacao);
                
                if(operacao){
                    
                    resultado = Float.parseFloat(valor1) + Float.parseFloat(valor);
                    System.out.println(""+valor+"------"+resultado+"");
                
                }else {
                    
                    resultado = Float.parseFloat(valor)- resultado;
                    System.out.println(""+valor+"------"+resultado+"");
                }

                
                break;
            

            default:
                
            }
        
    }

    class Terminador extends WindowAdapter 
    {

        public void windowClosing(WindowEvent e)
        {
        System.exit(0);
        }
    }

    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }


    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }


    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }


    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
        if(e.getSource().equals(visor)){
            System.out.println("asd");
            visor.setText("");
            
        }
        
    }


    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}