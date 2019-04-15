package pan.xu;
import javax.swing.*;
import javax.swing.text.LayeredHighlighter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.InputMismatchException;

public class mygeme {
    public static void main(String[]args){
        Game_windows first=new Game_windows();
    }
}
//JFrame
class Game_windows extends JFrame{
    private static float WAIT=0;/////////////////////////////////////
    private static JPanel panel;
    static Game_bird bird;
    private static Timer timer;
    private static ImageIcon image;
    Game_windows(){//创建一个基础的窗口
        ////缺一个定时器
        super();
        this.setTitle("愤怒的少波");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLayeredPane niubi=new JLayeredPane();
        panel=new JPanel();
        //super.add(panel);
        this.add(panel);
        //this.setSize(600,400);
        //布局待定
        panel.setLayout(new BorderLayout());


        //设置桌面的默认背景
        panel.setBackground(Color.cyan);

        JPanel panel2=new JPanel();
        //panel2.setVisible(true);
        image=new ImageIcon("C:\\Users\\10517\\Desktop\\java\\Swing_1\\src\\pan\\xu\\9.jpg");
        panel2.setBounds(0,0,image.getIconWidth(),image.getIconHeight());
        JLabel label=new JLabel(image);
        label.setBounds(0,0,image.getIconWidth(),image.getIconHeight());
        this.setSize(image.getIconWidth(),image.getIconHeight());
        panel2.add(label);
        niubi.add(panel2,JLayeredPane.DEFAULT_LAYER);
        //niubi.add(panel,JLayeredPane.PALETTE_LAYER);
        //niubi.setVisible(true);

        //this.setLayeredPane(niubi);

        JPanel fuck=new JPanel();
        fuck.setBounds(0,0,50,50);
        JButton button=new JButton("SHIYAN");
        fuck.add(button);
        niubi.add(fuck,JLayeredPane.PALETTE_LAYER);
        fuck.setVisible(true);
        this.setLayeredPane(niubi);
        //结束

        //定时器对于下降加速度的作用以及对于柱子移动的视觉效果
        timer=new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float high=0;
                high-=0.6;
                bird.setHigh(high);
                //对于柱子的视觉效果
                //bird.setV(100);
                bird.setV(100,100);

                /////////////////
            }
        });
        timer.start();
        panel.setLocation(0,0);
        bird=new Game_bird(WAIT);
        this.setVisible(true);

    }
    static void set_bird_jump(){//鸟受到一次空格事件
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==' '){
                    bird.location=bird.location+30;//
                }
            }
        });
    }
}

final class Game_bird{
    static float a;//加速度
    static float v1;//柱子的位置
    static float v2;//第二根柱子的位置
    static float high;//按一次空格鸟飞起来的高度
    static float location;//鸟的位置
    Game_bird(float location){
        this.location=location;
    }
    Game_bird(float a,float v,float high){
        this.a=a;
        this.v1=v;
        this.high=high;
    }
    void setA(float a){
        this.a=a;
    }
    void setV(float v,float v1){
        this.v1-=v;
        this.v2-=v1;
    }
    void setHigh(float high1,float high2){//分别是下降的高度和按一次空格上升的高度
        //this.high-=high1;
        this.high+=high2;
    }
    void setHigh(float high){//默认下降的速度
        this.high=high;
    }
}