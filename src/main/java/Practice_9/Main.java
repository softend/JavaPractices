package Practice_9;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame {

    List<Student> list = new ArrayList<>();
    private JTextArea textAreaINN=new JTextArea();

    private JTextArea textAreaName=new JTextArea();

    private JButton button = new JButton("Buy");

    private JLabel result = new JLabel("");

    private JLabel textName = new JLabel("Фамилия Имя");
    private JLabel textINN = new JLabel("ИНН");

    public Main(){
        super("Магазин");
        fillList(list);
        printList(list);
        this.setBounds(400,100, 550, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(6,1,2,2));

        container.add(textINN);
        container.add(textAreaINN);
        container.add(textName);
        container.add(textAreaName);
        container.add(button);
        container.add(result);

        setVisible(true);

        button.addActionListener(a -> {
                String INN="";
                String Name="";
            try {
                INN = textAreaINN.getText();
                Name = textAreaName.getText();
                System.out.println(INN+" _ "+Name);
                if (INN.equals("") || Name.equals("")){
                    System.out.println("FLAG");
                    throw new Exception();}
            }catch (Exception e){
                button.setText("Пустая строка!!!");
                throw new EmptyStringException("Empty string " ,e);
            }
            try {
                boolean flag=true;
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("Имя=["+list.get(i).getName()+"] Поле имя gui["+Name+"] ИНН ["+list.get(i).getINN()+
                            "] Поле ИНН gui ["+Integer.parseInt(INN)+"]");
                    if((list.get(i).getName().equals(Name)) && (String.valueOf(list.get(i).getINN()).equals(INN))){
                        System.out.println("ФЛАГ");
                        button.setText("Успешно!");
                        flag=false;
                        break;
                    }
                }
                if (flag) {
                    throw new Exception();
                }
            }catch (Exception e) {
                button.setText("Такого студента нет!!!");
                throw new StudentNotFoundException("No student", e);
            }
        });
    }

    private static void sortId(List list) {
        for (int i = 2; i < list.size(); i++){
            Practice_6.Student student = ((Practice_6.Student) list.get(i));
            int j = i-1;
            while (j>=0 && ((Student) list.get(j)).compareTo(student) != -1){
                list.set(j+1,(list.get(j)));
                j--;
            }
            list.set(j+1,student);
        }
    }

    private static void fillList(List<Student> list) {
        List<String> surn= new ArrayList<>();
        surn.add("Зенченко Илья");
        surn.add("Иванов Петр");
        surn.add("Петров Иван");
        surn.add("Шадаев Максуд");
        int id;
        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            do {
                id = (int) (Math.random() * 100);
            } while (list1.contains(id));
            list1.add(id);
            list.add(new Student(id, id+1000, surn.get(id%4)));
        }
    }

    private void printList(List<Student> list) {
        for (int i = 0; i< list.size(); i++){
            System.out.println((list.get(i)).getIdNumber() +" "+list.get(i).getINN()+" "+list.get(i).getName());
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
