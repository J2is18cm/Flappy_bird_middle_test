/*package pan.xu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MY_bird_game extends JFrame implements ActionListener{
    public static float middle=0;
    public static String path="C:\\Users\\10517\\Desktop\\java\\really_bird_game\\src\\pan\\xu\\";
    JLayeredPane layeredpane;
    JPanel background;//放置背景图
    JPanel birdpane;
    public MY_bird_game(){
        super();
        this.setTitle("期中大作业");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,600);
        ////////
        /*
        基础的定义
         */
/*
        layeredpane=new JLayeredPane();
        this.setLayeredPane(layeredpane);
        background=new JPanel();
        background.setBounds(0,0,900,600);
        layeredpane.add(background,JLayeredPane.DEFAULT_LAYER);
        //////////////
        pipe pipe1=new pipe();
        //pipe pipe2=new pipe();暂时用不上
        //////////////

        ///获取pipe对象的位置参数
        //float x=pipe1.getLocation_x();
        //float y=pipe1.getLocation_y();
        //////


        ////背景图
        ImageIcon image_background=new ImageIcon(path+"background.png");
        ImageIcon image_up_pipe=new ImageIcon(path+"pipe-north.png");
        ImageIcon image_down_pipe=new ImageIcon(path+"pipe-south.png");
        ImageIcon image_bird=new ImageIcon(path+"bird.png");
        //柱子
        JLabel label1=new JLabel(image_background);//背景
        JLabel label2=new JLabel(image_up_pipe);//上柱子
        JLabel label3=new JLabel(image_down_pipe);//下面柱子
        JLabel label4=new JLabel(image_bird);//鸟
        JPanel pipedown=new JPanel();
        JPanel pipeup=new JPanel();
        JPanel birds=new JPanel();
        birds.add(label4);
        pipedown.add(label2);
        pipeup.add(label3);
        background.add(label1);
        layeredpane.add(pipeup,JLayeredPane.PALETTE_LAYER);
        layeredpane.add(pipedown,JLayeredPane.PALETTE_LAYER);
        layeredpane.add(birds,JLayeredPane.MODAL_LAYER);
        //this.setVisible(true);
        ////定时器
        /*Timer time=new Timer(10,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                pipe1.move();
                System.out.println(pipe1.getLocation_x());
                pipeup.repaint();
                function(birds,pipedown,pipeup,pipe1,background);
                pipedown.repaint();
                //pipeup.repaint();
                background.repaint();
                //pipe2.move();
            }
        });*/
/*
        Timer time=new Timer(10,this);
        time.start();

        ////
        this.setVisible(true);
    }
    public static void main(String[]args){
        MY_bird_game one=new MY_bird_game();
    }

    void function(JPanel birds,JPanel pipedown,JPanel pipeup,pipe pipe1,JPanel background){
        birds.setBounds(200,150,45,35);
        //pipeup.setBounds(200,-300,60,400);//v需要大于-600小于0
        //pipedown.setBounds(200,200,60,400);//v需要大于200小于600
        //下面的柱子

        pipedown.setBounds(200,(int)pipe1.getLocation_y(),60,400);
        //background.setBounds(0,0,900,600);
        //上面的柱子
        pipeup.setBounds(200,(int)pipe1.getLocation_y()-500,60,400);
        //this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){

    }
}



class bird{
    private static float location;
    static String path="C:\\Users\\10517\\Desktop\\java\\really_bird_game\\src\\pan\\xu\\bird.png";
    static float uselessthing=0;
    private static float downspide=6f;
    private static float upspide=120f;
    public bird(){
        location=MY_bird_game.middle;//鸟的未开始的位置
    }

    void down(){//鸟的下降的速度
        location-=uselessthing;
        uselessthing+=downspide;
    }

    void up(){//鸟上升一次
        //uselessthing=upspide;
        location+=upspide;
        //uselessthing=upspide;
        upspide-=upspide-downspide;
    }
    void initialize(){//作为初始化
        this.downspide=6f;
        this.upspide=80f;
    }
}


class pipe{
    static float location_x;
    static float location_y;
    public pipe(){
        this.location_x=500f;
        location_y=(float)(Math.random()*300+200);
        //location_y=(float)((System.currentTimeMillis()%1000)*300+250);
    }
    public pipe(int i){
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
*/