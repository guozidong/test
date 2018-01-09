import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTcp extends JFrame{
    private PrintWriter writer;
    private JTextArea ta = new JTextArea();
    private JTextField tf = new JTextField();
    Container cc;

    private BufferedReader reader;//创建BufferedReader对象
    private ServerSocket server;//创建ServerSocket对象
    private Socket socket;//创建Socket对象socket

    public MyTcp(String title){

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

    void getserver(){
        try{
            server=new ServerSocket(8998);
            ta.append("服务器套接字已经创建成功\n");
            while(true){
                ta.append("等待客户机的连接\n");
                socket=server.accept();
                //writer = new PrintWriter(socket.getOutputStream(), true);
                reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                contact();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void contact(){
        try{
            while(true) {
                //获得客户端信息
                ta.append("客户机：" + reader.readLine());
                writer = new PrintWriter(socket.getOutputStream(), true);
            }
            }catch (Exception e){
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
        MyTcp tcp=new MyTcp("向客户端发送数据");
        tcp.setSize(200,200);
        tcp.setVisible(true);
        tcp.getserver();
    }
}
