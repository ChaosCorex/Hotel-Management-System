import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO
 */
public class ReceptionITT {
    
    public ReceptionITT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    //Function Login
    
    @org.junit.Test
    public void testOrderFood() {
        Reception R = new Reception();
        JButton B = new JButton();
        B.addActionListener((ActionEvent e) -> {
            R.setjButton4ActionPerformed(e);
        });
        B.doClick();
        String expected = "Room 1";
        assertEquals(expected,R.getFoodRoomNo());
    }

    @org.junit.Test
    public void testRoomService() {
        Reception R = new Reception();
        JButton B = new JButton();
        B.addActionListener((ActionEvent e) -> {
            R.setjButton1ActionPerformed(e);
        });
        B.doClick();
        String expected = "Room 1";
        assertEquals(expected,R.getRoomNo());
    }
    
    
    
    @org.junit.Test
    public void testLogin() {
        //Arrange
        Reception R = new Reception();
        JButton B = new JButton();
        String expecteduser = "rec";
        String expectedpass = "hotel";
        //Act
        B.addActionListener((ActionEvent e) -> {
            R.setLoginButtonActionPerformed(e);      //Call setter function to test the private function
        });
        B.doClick();                                 //simulate button click
        //Assert
        assertEquals(expecteduser,R.getUser());      //function to retrieve user from textbox
        assertEquals(expectedpass,R.getPass());
    }
    
    @org.junit.Test
    public void LoginTest(){ //test user wrong
        Reception Rec = new Reception();
        JButton B = new JButton();
        String expectedUser = "reception";
        String expectedPass = "666";
        B.addActionListener((ActionEvent e) ->{
            Rec.setLoginButtonActionPerformed(e);});
        B.doClick();
         assertEquals(expectedUser,Rec.getUser());
         assertEquals(expectedPass,Rec.getPass());
        }
     
        //arrange
        
    @org.junit.Test
    public void LoginTest1(){ //test pass wrong
        Reception Rec = new Reception();
        JButton B = new JButton();
        String expectedUser = "rec";
        String expectedPass = "666";
        B.addActionListener((ActionEvent e) ->{
            Rec.setLoginButtonActionPerformed(e);});
        B.doClick();
         assertEquals(expectedUser,Rec.getUser());
         assertEquals(expectedPass,Rec.getPass());
        }
   /* @Test
    public void LoginTest3(){ //pass
        //arrange
        Reception Rec = new Reception();
        String user = "rec";
        String pass = "hotel";
        String[] expected = {"T" , "T"};
        //act
        String result1 = Rec.Username.setText(user);  
        String result2 = Rec.Password.setText(pass); //MAriooooooo change it to public
        String[] result = {result1 , result2}; //Mario e3ml return ll true 
        //assert
        assertEquals("Wrong user input",expected,result);
        
    }*/
    
    //Login Fuction

    @org.junit.Test
    public void LoginTest2(){ //pass
        Reception Rec = new Reception();
        JButton B = new JButton();
        String expectedUser = "rec";
        String expectedPass = "hotel";
        B.addActionListener((ActionEvent e) ->{
            Rec.setLoginButtonActionPerformed(e);});
        B.doClick();
         assertEquals(expectedUser, Rec.getUser());
         assertEquals(expectedPass,Rec.getPass());
        }
    
    //Function ReservedRooms
    @org.junit.Test
    public void RoomTest(){ //single true
        //arrange
        Reception Rec = new Reception();
        JButton B = new JButton();
        String expectedRoom = "Single";
        B.addActionListener((ActionEvent e) ->{
            Rec.setNext_Room1ActionPerformed(e);});
        B.doClick();
         assertEquals(expectedRoom, Rec.getRoomType());
         
        }

    
    @org.junit.Test
     public void RoomTest1(){ //double false
        //arrange
        Reception Rec = new Reception();
        JButton B = new JButton();
        String expectedRoom = "Double";
        B.addActionListener((ActionEvent e) ->{
            Rec.setNext_Room1ActionPerformed(e);});
        B.doClick();
         assertEquals(expectedRoom, Rec.getRoomType());
         
        }

   
    
    //test case for checkout and make a reservation of a room availability
    @org.junit.Test
    public void reservied(){ //available or not , 
        //arrange
        Reception Rec = new Reception();
        JButton B = new JButton();
        boolean expectedRoom = true;
        B.addActionListener((ActionEvent e) ->{
            Rec.setMake_A_ReservationActionPerformed(e);});
        B.doClick();
         assertEquals(expectedRoom, Rec.roomAvailability());
         
        }
    
    @org.junit.Test
    public void CheckOutTest(){
        //arrange
        Reception Rec = new Reception();
        JButton B = new JButton();
        boolean expectedRoom = false;
        B.addActionListener((ActionEvent e) ->{
            Rec.setCheckoutActionPerformed(e);});
        B.doClick();
         assertEquals(expectedRoom, Rec.roomAvailability());
         
        }
    
}