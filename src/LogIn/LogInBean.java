package LogIn;

import java.io.*;
import java.util.Date;

/**
 * Created by liushb  on 2016/11/14.
 */
public class LogInBean {
    private String userName;
    private String password;
    private String email;
    private String  birthday;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void write()throws Exception{
        File file=new File("C:\\Users\\liu\\workspace\\JavaEE\\log_info.txt");
        if (!file.exists())
            file.createNewFile();
//        FileReader fileReader=new FileReader(file);
//        BufferedReader bufferedReader=new BufferedReader(fileReader);

        FileWriter writer=new FileWriter(file,true);
        BufferedWriter bufferedWriter=new BufferedWriter(writer);
        bufferedWriter.write("\n用户名:"+getUserName().trim()
                              +" 密码:"+getPassword()
                              +" 邮箱:"+getEmail()
                              +" 生日:"+getBirthday());
        System.out.println(file.getAbsolutePath());
        bufferedWriter.close();

//        System.out.println("用户名:"+getUserName()
//                +" 密码:"+getPassword()
//                +" 邮箱:"+getEmail()
//                +" 生日:"+getBirthday());




    }
}
