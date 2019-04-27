package pan.xu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.concurrent.ScheduledExecutorService;

public class MY_BIRD_GAME_2 extends JFrame implements ActionListener {
    ScheduledExecutorService timer;
    public static String path="C:\\Users\\10517\\Desktop\\java\\really_bird_game\\src\\pan\\xu\\";
    JLayeredPane layeredpane;
    myJPanel background;//放置背景图
    myJPanel pipeup;
    myJPanel pipedown;
    myJPanel bird;
    static final int bird_x=150;
    static int bird_y=280;
    static int xx=900;
    static int yy=200;
    static int flag=1;
    /////////////////////////////////////////监控器
    @Override
    public void actionPerformed(ActionEvent e){
        xx=xx-12;

        //pipeup.setBounds(xx,-300,60,400);
        pipeup.setBounds(xx,yy,60,400);
        //pipedown.setBounds(xx,200,60,400);
        pipedown.setBounds(xx,(yy-600),60,400);

        bird.setBounds(bird_x,bird_y,45,32);
        bird_down();
        keyboard();
        //循环代码
        if(xx<=0) {
            xx = 900;
            yy = (int) (Math.random() * 300 + 200);
        }

    }
    ///////////////////////////////////


    ///////////////////////////////////////键盘监控器
    private void keyboard(){
        //bird=new myJPanel("bird.png");
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e1) {
                if(e1.getKeyCode()==KeyEvent.VK_SPACE) {
                    if(bird_y<0)
                        flag = 1;
                    else {
                        bird_y -= 2;
                        flag=1;
                    }
                }
            }
        });
    }
    ////***********************************
    private static void bird_down(){
        if(bird_y>500)
            ;
        else {
            flag += flag;
            bird_y += flag;
        }
    }
    //*********************************构造函数
    public MY_BIRD_GAME_2(){
        super();
        this.setTitle("期中大作业");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,900,600);
        layeredpane=new JLayeredPane();
        this.setLayeredPane(layeredpane);
        //bird=new myJPanel("bird.png");
        Timer timer=new Timer(100,this);
        timer.start();
            //////////////////背景
            background=new myJPanel("background.png");
            background.setBounds(0,0,900,600);
            layeredpane.add(background,JLayeredPane.DEFAULT_LAYER);
            ////////////////////
            //****************管子
            pipeup=new myJPanel("pipe-north.png");
            pipedown=new myJPanel("pipe-south.png");
            pipeup.setBounds(200,-300,60,400);
            pipedown.setBounds(200,200,60,400);
            layeredpane.add(pipeup,JLayeredPane.PALETTE_LAYER);
            layeredpane.add(pipedown,JLayeredPane.PALETTE_LAYER);
            //****************

            ///////鸟
            bird=new myJPanel("bird.png");
            bird.setBounds(bird_x,bird_y,45,32);
            layeredpane.add(bird,JLayeredPane.MODAL_LAYER);
            //keyboard(bird);
            /////////



        this.setVisible(true);
    }
    //*********************************
    public static void main(String[]args){
        MY_BIRD_GAME_2 ee=new MY_BIRD_GAME_2();
    }

}

class PIPE{
    static float location_x;
    static float location_y;
    public PIPE(){
        this.location_x=500f;
        location_y=(float)(Math.random()*300+200);
        //location_y=(float)((System.currentTimeMillis()%1000)*300+250);
    }
    public PIPE(int i){
        //this.location_x=
    }
    void move(){
        this.location_x=location_x-20f;
    }
    float getLocation_x(){
        return location_x;
    }
    float getLocation_y(){
        return location_y;
    }
}

class BIRD{

}

class myJPanel extends JPanel{
    public static JLabel label;
    public static ImageIcon image;
    public myJPanel(String string){
        super();
        image=new ImageIcon("C:\\Users\\10517\\Desktop\\java\\really_bird_game\\src\\pan\\xu\\"+string);
        label=new JLabel(image);
        this.add(label);
    }

    public myJPanel(String string,int i){
        super();
        image=new ImageIcon("C:\\Users\\10517\\Desktop\\java\\really_bird_game\\src\\pan\\xu\\"+string);
        label=new JLabel(image);
        this.add(label);
    }
}