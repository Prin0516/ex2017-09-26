import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MainFrame  extends Frame {
    private Button btn=new Button("add");
    private Button subbtn=new Button("sub");
    private Button exitbtn=new Button("exit");
    private Label lab=new Label("----");
    private int labX=50,labY=50;
    private int count=0;
    private Timer t1;
    private boolean boo=true;

    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(10,10,400,500);
        int a=this.getWidth();
        this.setLayout(null);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
        btn.setBounds(300,300,30,30);
        this.add(btn);
        lab.setBounds(labX,labY,30,30);
        this.add(lab);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(count);
                MainFrame.this.setTitle(Integer.toString(++count));
                lab.setText(Integer.toString(count));
                t1.start();

            }
        });
        exitbtn.setBounds(100,300,30,30);
        exitbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.add(exitbtn);
        subbtn.setBounds(200,300,30,30);
        subbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setText(Integer.toString(--count));
            }
        });

        this.add(subbtn);
        t1=new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;
                lab.setText(Integer.toString(count));
                if(boo==false){
                    labX-=10;
                    lab.setLocation(labX,labY);
                    System.out.println(labX);
                }else if(boo==true){
                    labX+=10;
                    lab.setLocation(labX,labY);
                    if(labX>=a){
                        boo=false;

                    }
                }


            }

        });




    }

}
