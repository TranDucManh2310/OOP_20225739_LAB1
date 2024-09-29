import javax.swing.JOptionPane;
public class ToanTu {
    public static void main(String[] args) { 
        String strNum1, strNum2; 
        double Num1, Num2, tong, hieu, tich, thuong;

        
        strNum1 = JOptionPane.showInputDialog(null, "Please input your first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        Num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Please input your second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        Num2 = Double.parseDouble(strNum2);

        
        tong = Num1 + Num2;
        hieu = Num1 - Num2;
        tich = Num1 * Num2;
        thuong = Num1 / Num2;

        
        JOptionPane.showMessageDialog(null, "Tong 2 so la: " + tong, "Result", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hieu 2 so la: " + hieu, "Result", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Tich 2 so la: " + tich, "Result", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Thuong 2 so la: " + thuong, "Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
