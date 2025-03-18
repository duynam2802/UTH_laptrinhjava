package edu.uth.jpa_demo.models;
import jakarta.persistence.*;

@Entity
@Table (name = "users")
public class User {
    @Id   // Định nghĩa cột ID làm khóa chính của bảng
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Tự động tăng giá trị ID theo chiến lược IDENTITY (phụ thuộc vào DB, thường dùng AUTO_INCREMENT)
    private Long id;

    private String username;  // Cột username, có thể được ánh xạ tự động vào database
    private String password;
    //Getter/Setter


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User() {

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
