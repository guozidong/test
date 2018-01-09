import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClien extends JFrame{
    private PrintWriter writer;
    Socket socket;
    private BufferedReader reader;//创建BufferedReader对象
    private JTextArea ta=new JTextArea();
    private JTextField tf=new JTextField();
    Container cc;

    public MyClien(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cc=this.getContentPane();
        final JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
        getContentPane().add(scrollPane,BorderLayout.CENTER);
        scrollPane.setViewportView(ta);
        cc.add(tf,"South");
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //将文本框中的信息写入流
                writer.println(tf.getText());
                ta.append('\n'+"发送："+tf.getText()+'\n');
                ta.setSelectionEnd(ta.getText().length());
                tf.setText("");
            }
        });
    }
    private void connect(){
        ta.append("尝试连接\n");
        try{
            socket = new Socket("127.0.0.1",8998);
            writer = new PrintWriter(socket.getOutputStream(), true);
            ta.append("完成连接\n");
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            contact();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void contact(){
        try{
            while(true) {
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                ta.append("服务器:"+reader.readLine());
                writer = new PrintWriter(socket.getOutputStream(), true);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            if(reader!=null){
                reader.close();
            }
            if(socket!=null){
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        MyClien clien = new MyClien("向服务器发送数据");
        clien.setSize(200,200);
        clien.setVisible(true);
        clien.connect();
    }
}

