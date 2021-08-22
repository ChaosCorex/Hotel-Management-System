/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.platform.commons.function.Try.success;

/**
 *
 * @author Chaos X
 */
public class ReceptionIT {
    
    public ReceptionIT() {
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

    /**
     * Test of jButton4ActionHack method, of class Reception.
     */
   
    
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
    
}
    
