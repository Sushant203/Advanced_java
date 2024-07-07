package com.db.swing;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

import java.sql.Connection;

public class  DbRunnable {
	private Scanner sc;
	private Connection conn;
	boolean continueOperation= true;
	DbRunnable(){
		while(continueOperation) {
			try {
		 sc= new Scanner(System.in);
		System.out.println("enter your operation choice: \n1.Insert \n 2. Update \n 3. Delete \n 4.Display \n 5. exit");
		int ch=sc.nextInt();
		sc.nextLine();			
		switch (ch) {
		case 1: 
			insert();
			break;
		
		case 2:
			update();
			break;
		case 3:
			delete();
			break;
		
		case 4:
			display();
			break;
		case 5:
			continueOperation= false;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
			}catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear the invalid input
            }
		}
		sc.close();
	
	}
	void insert() {
		try {
			 conn= DBConnect.getConnection();
		if(conn!=null) {
		
		System.out.println("enter the id of product:");
		int id= sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name of product:");
		String name= sc.nextLine();
		System.out.println("enter the price of product:");
		String price= sc.nextLine();
		
		String query= "INSERT INTO product (id,name,price) VALUES(?,?,?)";
		PreparedStatement stmt= conn.prepareStatement(query);
		stmt.setInt(1,id);
	 stmt.setString(2, name);
		stmt.setString(3, price);
		
		int rowsInserted = stmt.executeUpdate();
        if (rowsInserted > 0) {
	System.out.println("A new product was inserted successfully!");
        }
    } else {
    System.out.println("Connection not established");
   }
		
		}catch(SQLException e) {
			System.out.println("sql error:"+e.getMessage());
		}
	}
	void display() {
		try {
			  conn = DBConnect.getConnection();
		if(conn!=null) {
		String query= "SELECT * FROM product";
		Statement stmt= conn.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println("id:"+rs.getInt("id"));
			System.out.println("name:"+rs.getString("name"));
			System.out.println("price"+rs.getString("price"));
		}
		}
		
		}catch(SQLException e) {
			System.out.println("sql error:"+e.getMessage());
		}
		
	}
	
	
	
	void update() {
		try {
			 conn = DBConnect.getConnection();
		if(conn!=null) {
			String query= "UPDATE product SET name=?, price= ? WHERE id=?";
			PreparedStatement stmt= conn.prepareStatement(query);
			System.out.println("enter the name to be updated:");
			String name= sc.nextLine();
			System.out.println("enter the price to be updated:");
			String price= sc.nextLine();
			System.out.println("enter the id to be updated:");
			int id= sc.nextInt();
			stmt.setString(1, name);
			stmt.setString(2, price);
			stmt.setInt(3, id);
			stmt.executeUpdate();
		}
		}catch(SQLException e) {
			System.out.println("sql error:"+ e.getMessage());
		}
		
	}
	
	void delete() {
        try {
          conn = DBConnect.getConnection();
            if (conn != null) {
                String query = "DELETE FROM product WHERE id = ?";
                System.out.println("Enter the id of the product to be deleted:");
                int id = sc.nextInt();
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setInt(1, id);
                int rowsDeleted = stmt.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("Product deleted successfully.");
                } else {
                    System.out.println("Product with the given ID not found.");
                }
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e.getMessage());
        }

    }
	public static void main(String[] args){
	new DbRunnable();	}
	}
		
	

