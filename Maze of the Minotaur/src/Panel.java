import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Random;

public class Panel extends JPanel {
    String rooms[] = {
            "Мрачное подземелье, голая кирпичная стена, обвалившийся местами потолок, несколько дверей ведущих в разных направлениях",
            "Видимо это бывшая оружейная комната. Но все давно проржавело и покрыто пылью",
            "Похоже здесь что-то хранили, деревянные полки, мешки",
            "Все в паутине, скорее бы выбраться в другую комнату",
            "Кап-кап-кап - раздается звук падающих капель. Сыро и мерзко",
            "Голые каменные стены, кажется здесь ничего нет",
            "Остатки мебели натолкнули на мысль что здесь когда то была комора",
            "Четыре стены, сухой воздух, ничего особенного",
            "Обычная комната четыре метра на четыре",
            "Эта комната больше чем обычно, но похоже в ней ничего нет",
            "Кроме скелета на полу ничего интересного",
            "Длинный коридор в конце которого виднеются двери",
            "Похоже комната стражи, несколько коек и разбитый котел в углу",
            "Обычная комната, голые стены и камень под ногами"
    };

//    Random rand = new Random();
//
//        for (int i = 0; i < 100; i++) {
//        System.out.println(rand.nextInt(11));
//    }

    String roomDescr[] = {
            "В комнате ничего нет",
            "Вы нашли зелье здоровья",
            "Вы встретили монстра"
    };
    int[] roomModificator = {0, 2, -2};
    int health = 5;
    int level = 0;

    JButton b1;
    private JTextField output = new JTextField();
    private JTextField output2 = new JTextField();

    public Panel() {
        setLayout(null);

        output.setBounds(10, 10, 325, 50);
        output.setEditable(false);
        add(output);

        output2.setBounds(10, 320, 325, 50);
        output2.setEditable(false);
        add(output2);

        int random = (int) (Math.random() * (rooms.length - 1));
        String descr = rooms[random];
        output2.setText(descr);

//        ActionListener l = (ActionEvent e) -> {
//            JButton b = (JButton)e.getSource();
//            output.setText(output.getText() + b.getText());
//        };

        JButton b1 = new JButton("S");
        b1.setBounds(40, 160, 80, 50);
        add(b1);

        JButton b2 = new JButton("N");
        b2.setBounds(230, 160, 80, 50);
        add(b2);

        JButton b3 = new JButton("end");
        b3.setBounds(135, 160, 80, 50);
        add(b3);

        JButton b4 = new JButton("W");
        b4.setBounds(135, 80, 80, 50);
        add(b4);

        JButton b5 = new JButton("E");
        b5.setBounds(135, 240, 80, 50);
        add(b5);

        b1.addActionListener(l);
        b2.addActionListener(l);
        b3.addActionListener(l);
        b4.addActionListener(l);
        b5.addActionListener(l);
    }

    ActionListener l = (ActionEvent e) -> {
        String direction = e.getActionCommand().toLowerCase();

        if (Objects.equals(direction, "w")) {
            output.setText("Вы идете на Запад" + '\n' + output.getText());
        } else if (Objects.equals(direction, "n")) {
            output.setText("Вы идете на Север" + '\n' + output.getText());
        } else if (Objects.equals(direction, "s")) {
            output.setText("Вы идете на Юг" + '\n' + output.getText());
        } else if (Objects.equals(direction, "e")) {
            output.setText("Вы идете на Восток" + '\n' + output.getText());
        } else if (Objects.equals(direction, "end")) {
            output.setText("Игра окончена" + '\n' + output.getText());
        }

//        TODO get room description
//        TODO get random modifier -> apply to health
//        TODO increase level++
//        TODO if health <= 0 -> lose
//        TODO if level == 10 -> win
    };
//    for(;;){
//
//        int random = (int) (Math.random() * (rooms.length - 1));
//        String descr = rooms[random];
//        output2.setText(descr);
//
//
//    }
}