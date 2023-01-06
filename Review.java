import javax.swing.JOptionPane;

public class Review {
    public static void main(String[] args) {
    
        Review rev = new Review();
        JOptionPane.showConfirmDialog (null, "Do you like the movie recommender we provide? ");
    
        int choose =0;
        if (choose == 0)
        {
            JOptionPane.showConfirmDialog(null, "Thank you for your cooperation !", "REVIEW", JOptionPane.DEFAULT_OPTION);

        }
        
        else if (choose == 1)
        {
            String getComment = JOptionPane.showInputDialog("State why and what we need to improvise");
        }
        else
            JOptionPane.showConfirmDialog(null, "Have a nice day <3 ", "REVIEW", JOptionPane.DEFAULT_OPTION);
            JOptionPane.showConfirmDialog(null, "Thank you for your review !", "REVIEW", JOptionPane.DEFAULT_OPTION);

    }

}