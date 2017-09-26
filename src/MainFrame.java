import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame  extends Frame {
    private Button btn=new Button("add");
    private Label lab=new Label("----");
    private int count=0;

    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(10,10,400,500);
        this.setLayout(null);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
        btn.setBounds(100,100,30,30);
        this.add(btn);
        lab.setBounds(100,200,30,30);
        this.add(lab);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle(Integer.toString(++count));
                lab.setText(Integer.toString(count));
            }
        });


    }

}
