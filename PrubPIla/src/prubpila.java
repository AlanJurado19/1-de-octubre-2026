import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prubpila {
    private JPanel Ventana;
    private JTextField DATO;
    private JButton agregarButton;
    private JButton editarButton;
    private JButton cimaButton;
    private JTextField SEARCH;
    private JTextArea textArea1;
    private JButton buscarButton;
    public Pilaint pila = new Pilaint();                                            //
                                                                                    //   Crear uno
    public prubpila()                                                               //
    {
        agregarButton.addActionListener(new ActionListener() {
            @Override                                                                // No tocar nada solo codificara el la linea libre quegenero el codigo
            public void actionPerformed(ActionEvent e) {
                Integer i = Integer.parseInt(DATO.getText());
                pila.push(i);
                textArea1.setText(pila.sacarPila());
            }
        });

        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Integer i = pila.pop();
                    JOptionPane.showMessageDialog(null,i);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        cimaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Integer i = pila.peek();
                    JOptionPane.showMessageDialog(null,i);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Integer i=Integer.parseInt(SEARCH.getText());
                    int posicion = pila.search(i);
                    JOptionPane.showMessageDialog(null, "El dato "+i+"se encuentra en la posicion "+posicion);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Prueba de la pila");
        frame.setContentPane(new prubpila().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
