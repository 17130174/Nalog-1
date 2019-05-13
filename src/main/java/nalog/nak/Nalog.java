/*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. */
package nalog.nak;    
/* java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt - подключение пакета awt, содержащего базовые графические функции: GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */
import java.awt.*;
import java.awt.event.*;
/* Импортируем:
javax.* — стандартные расширения. (Стандартные расширения (standard extensions) — это пакеты или наборы пакетов Java)
Swing - Библиотека графического интерфейса (конкретный пакет), В отличие от java.awt, javax.swing имеет более гибкую
систему управления и более широкий набор функций
"*"-включение всех элементов библиотеки Swing (jbutton,jpanel,jlabel и т.д.)
"." используется для выделения элементов из ссылки на объект.
*/
import javax.swing.*;  
/*библиотека необходимая для того, чтобы установить отступы*/
import javax.swing.border.*;
/* (Public) - поля и методы класса Nalog доступны для всех других объектов и классов.
зарезервированное слово class - говорит транслятору, что мы собираемся описать новый класс Nalog.
Класс наследует функции элемента JFrame, который определён в стандартной библиотеке awt.
JFrame - само окно. JFrame содержит в себе всё необходимое для создания и функционирования окна программы - мы
используем его методы в своей программе. { }-описание класса располагается между фигурными скобками.
*/
	public class Nalog extends JFrame{
	private static final long serialVersionUID = 1L;
	/* Nalog() - это установка компонентов (панель вкладок) на JFrame.
	(Public) - означает что фрейм Nalog можно вызвать из любого файла, который лежит в пакете NalogC.
	static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса. К статическим методам
	и переменным можно обращаться через имя класса*/
	public static Nalog frame = new Nalog(); 
	/*
	Модификатор доступа public означает, что метод main(String[] args) виден и доступен любому классу.
	static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса. К статическим методам
	и переменным можно обращаться через имя класса.
	void означает, что метод main(String[] args) не возвращает данных в программу, которая его вызвала,
	а просто выводит на экран строку.
	В методе main слова String[] args означают, что этот может получать массив объектов с типом String, т.е. текстовые данные.
	Программа может состоять из нескольких классов, но только один из них содержит метод main().
	Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс,
	начинают свою работу с вызова метода main.
	*/
	public static void main(String[] args) { 
		/*Статический метод, который добавляет объект в eventQueue
		 В EvenQueue много событий, таких как события клавиатуры или события мыши.*/
	EventQueue.invokeLater(new Runnable() {
		/* public - модификатор доступа, означающий, что метод run() виден и доступен любому классу.
		void ()означает, что метод run не возвращает данных в программу, которая его вызвала,
		а просто выводит на экран строку.
		Метод run с пустыми скобками, т.е. метод не имеет аргументов(параметров)
		*/
	public void run() {
		/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try.
		Сразу же после try-блока помещается блок catch, задающий тип исключения, которое вы хотите обрабатывать.
		Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
		1. Выполняется код внутри блока try. 2. Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение
		доходит до конца try и потом прыгает через catch. 3. Если в нём возникнет ошибка, то выполнение try на ней
		прерывается, и управление прыгает в начало блока catch(err).
		*/
	try {
		/*Устанавливаем, что окно Nalog видно пользователю*/
	frame.setVisible(true); 
	} catch (Exception e) {
		/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try.
		Сразу же после try-блока помещается блок catch, задающий тип исключения, которое вы хотите обрабатывать.
		Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
		1. Выполняется код внутри блока try. 2. Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение
		доходит до конца try и потом прыгает через catch. 3. Если в нём возникнет ошибка, то выполнение try на ней
		прерывается, и управление прыгает в начало блока catch(err).
		*/
	e.printStackTrace();
	}
	}
	});
	}
	/*Панель, на которой располагаются поля и кнопки. Панель доступна только для данного класса (private)*/
	private JPanel panel1;
	/*Кнопки "Админ" и "Пользователь", которые доступны только для данного класса*/
	private JButton calc,calc2;
	/*Компонент, на котором располагается текст*/
	private JLabel label_1;
	/*Статическое имя метода. Доступно всем*/
	public static double int_rad;
	/*Значение начальных переменных*/
	static int a=13,a1=13,a2=15,a3=30,a4=35;
	/*Модификатор доступа public означает, что метод Nalog() виден и доступен любому классу.
	static означает, что не нужно создавать экземпляр(копию) объекта Nalog в памяти, чтобы использовать этот метод.
	Nalog - расположение на фрейме компонентов (панель вкладок)*/
	public Nalog() { 
	/*Устанавливает название окна*/
	setTitle("Меню");
	setResizable(false);
	/*Указывает ширину и высоту*/
	setSize(225, 175); 
	/*Установить посередине экрана*/
	setLocationRelativeTo(null);
	/*По закрытию формы - не закрывать приложение*/
	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	/* Оператор new создает экземпляр указанного класса
	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
	Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается
	на пять частей. В каждой из этих частей располагается один компонент.
	При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает,
	куда именно он хочет поместить компонент.*/
	setLayout (new BorderLayout()); 
	/*Панель, на которой располагается текстовое поле и кнопки*/
	panel1 = new JPanel();
	/*Добавление панели panel1 по центру*/
	add(panel1, BorderLayout.CENTER);
	/*Установка внутренних отступов (сверху, слева, снизу, справа)*/
	panel1.setBorder(new EmptyBorder(10,10,10,10));
	/*Установка менеджера компоновки GridLayout. Данный менеджер компоновки располагает компоненты в
	 таблицу */
	/* на панели 3 строки, 1 столбец ,5 - расстояние между столбцами, 5 - между строками */
	panel1.setLayout(new GridLayout(3,1,5,5));
	/*Обозначаем, что переменные calc, calc2  являются объектом
	/*JButton в скобках - надпись на кнопке*/
	calc = new JButton("Пользователь");
	calc2 = new JButton("Админ");
	/*Обозначаем, что переменная label_1 являются объектом JLabel, и указываем, какой текст будет выводиться.
	JLabel.CENTER - выравнивание по центру
	*/
	label_1 = new JLabel("Зайти как:", JLabel.CENTER);
	/*Добавление компонента JLabel на панель panel1*/
	panel1.add(label_1);
	/*Добавление компонента JLabel на панель panel1*/
	panel1.add(calc);
	/*Добавление компонента JButton на панель panel1*/
	panel1.add(calc2);
	/*Обработка событий при нажатии на кнопку calc*/
	calc.addActionListener(new ActionListener() { 
           public void actionPerformed(ActionEvent e) {
        	   /*Вызов main2 из класса Nalog*/
        	   Nalog.main2(null);
        	   }
       });
	/*Обработка событий при нажатии на кнопку calc2*/
	calc2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	/*Вызов main из класса Password*/
        	Password.main(null);
     		}
 });
	}
	/*
	Модификатор доступа public означает, что метод main2(String[] args) виден и доступен любому классу.
	static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса. К статическим методам
	и переменным можно обращаться через имя класса.
	void означает, что метод main2(String[] args) не возвращает данных в программу, которая его вызвала,
	а просто выводит на экран строку.
	В методе main2 слова String[] args означают, что он может получать массив объектов с типом String, т.е. текстовые данные.
	Программа может состоять из нескольких классов, но только один из них содержит метод main().
	Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс,
	начинают свою работу с вызова метода main2.
	*/
public static void main2(String[] args) { 
	/*SwingUtilities.invokeLater предназначена для запуска асинхронной операции. 
	 Она сохраняет действие (Runnable) и запускает его на одной из следующих итераций цикла сообщений.*/
SwingUtilities.invokeLater(new Runnable() { 
	/* public - модификатор доступа, означающий, что метод run() виден и доступен любому классу.
	void ()означает, что метод run не возвращает данных в программу, которая его вызвала,
	а просто выводит на экран строку.
	Метод run с пустыми скобками, т.е. метод не имеет аргументов(параметров)
	*/
public void run() { 
	/*Компонент, на котором располагается окно*/
final JFrame form2 = new JFrame();
/*Панель, на которой располагаются текстовые поля, поле ввода и кнопки.*/
JPanel panel, panel1; 
/*Кнопки "Рассчитать" и "В меню" */
JButton calc,calc2; 
/*Компоненты, на котором располагается текст*/
JLabel label_1,label_2,label_3, label_4,label_n;
final JLabel sum_n;
final JLabel sum;
JLabel label_n1,label_n2,label_n3,label_n4; 
/*Текстовое поле, в которое пользователь вводит данные */
final JTextField sum_ok;
/*Компонент переключатель (при нажатии на одну из
таких кнопок ранее нажатая кнопка возвращается в исходное состояние)*/
JRadioButton rad_13, rad_13_1,rad_15, rad_30, rad_35;
/*Устанавливает название окна в form2*/
form2.setTitle("Калькулятор НДФЛ");
/*Указывает ширину и высоту в form2.*/
form2.setSize(475, 290); 
form2.setResizable(false);
/*Установить посередине экрана в form2*/
form2.setLocationRelativeTo(null); 
/*По закрытию формы - не закрывать приложение в form2*/
form2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
/*К панели добавляем менеджер BorderLayout в form2 */
form2.setLayout (new BorderLayout()); 
/*Окно создается видимым*/
form2.setVisible(true); 
/*Панель, на которой располагается текстовое поле и кнопки-переключатели*/
panel = new JPanel(); 
/*Панель, на которой располагается кнопки*/
panel1 = new JPanel();
/*Добавление панели panel по центру в form2*/
form2.add(panel, BorderLayout.CENTER); 
/*Добавление панели panel2 снизу в form2*/
form2.add(panel1, BorderLayout.SOUTH); 
/*Установка внутренних отступов (сверху, слева, снизу, справа)*/
panel.setBorder(new EmptyBorder(10,0,10,10)); 
/*Установка внутренних отступов (сверху, слева, снизу, справа)*/
panel1.setBorder(new EmptyBorder(10,10,10,10)); 
/*Установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в 
 таблицу */
/*На панели 9 строк, 2 столбца, 5 - расстояние между столбцами,  0 - между строками*/
panel.setLayout(new GridLayout(9,2,5,0)); 
/*На панели 1 строка, 2 столбца, будут расположены кнопки*/
panel1.setLayout(new GridLayout(1,2)); 
/*Обозначаем, что переменные label_1,label_2,label_3, label_4,label_n,sum_n,
 * sum,label_n1,label_n2,label_n3,label_n4 являются объектом
 *  JLabel, и указываем, какой текст будет выводиться.
JLabel.CENTER - выравнивание по центру
JLabel.LEFT - выравнивание по левому краю
JLabel.RIGHT - выравнивание по правому краю
*/
label_1 = new JLabel("Вычислить налог для:", JLabel.LEFT);
label_2 = new JLabel("Резидент", JLabel.LEFT); 
label_3 = new JLabel("Сумма налога, руб.", JLabel.LEFT); 
label_4 = new JLabel("Сумма на руки, руб.", JLabel.LEFT); 
label_n = new JLabel(""); 
label_n1 = new JLabel("Нерезидент"); 
label_n2 = new JLabel("Доход", JLabel.RIGHT); 
label_n3 = new JLabel("это:", JLabel.LEFT); 
label_n4 = new JLabel("");
sum_n = new JLabel("", JLabel.CENTER); 
sum = new JLabel("", JLabel.CENTER); 
/*Обозначаем, что переменные calc,calc2  являются объектом
 *  JButton в скобках - надпись на кнопке*/
calc = new JButton("Рассчитать"); 
calc2 = new JButton("В меню"); 
calc2.setBackground(Color.GREEN);
/*Текстовое поле, в которое пользователь вводит данные */
sum_ok = new JTextField(); 
sum_ok.addKeyListener(new KeyAdapter() {
    public void keyTyped(KeyEvent e) { 
    	JDialog Q = new JDialog();
        if (sum_ok.getText().length() >= 10 ) { 
            e.consume(); 
        }
    }  
});
/*выравнивание текста по центру*/
sum_ok.setHorizontalAlignment(JTextField.CENTER);
/*установка внутренних отступов для текстового поля (2 - верхний отступ, 5 - левый, 2 - нижний, 5 - правый)*/
sum_ok.setMargin(new Insets(2, 5, 2, 5)); 
/*Группа кнопок*/
/*Обозначаем, что переменные rad_13, rad_13_1,rad_15, 
 * rad_30, rad_35 являются компонентом переключателем
 *  JRadioButton, и указываем, какой текст будет выводиться.
JRadioButton.LEFT - выравнивание по левому краю
*/
ButtonGroup group = new ButtonGroup(); 
rad_13 = new JRadioButton("Иное",false);
/*Добовляем в группу кнопку переменные
 * rad_13, rad_13_1, rad_15, 
 * rad_30, rad_35*/
group.add(rad_13); 
rad_13.setHorizontalAlignment(JRadioButton.LEFT); 
rad_13_1 = new JRadioButton("Любой доход гражданина ЕАЭС",false); 
group.add(rad_13_1); 
rad_13_1.setHorizontalAlignment(JRadioButton.LEFT); 
rad_15 = new JRadioButton("Дивиденты", false); 
group.add(rad_15); 
rad_15.setHorizontalAlignment(JRadioButton.LEFT); 
rad_30 = new JRadioButton("Иное", false); 
group.add(rad_30); 
rad_30.setHorizontalAlignment(JRadioButton.LEFT); 
rad_35 = new JRadioButton("Выйгрыш,займ или приз", false); 
group.add(rad_35); 
rad_35.setHorizontalAlignment(JRadioButton.LEFT); 
/*Добавление компонентов JRadioButton, JLabel, JTextField на панель panel*/
panel.add(label_1);
panel.add(label_n); 
panel.add(label_2); 
panel.add(label_n1); 
panel.add(label_n2); 
panel.add(label_n3); 
panel.add(rad_35); 
panel.add(rad_13_1); 
panel.add(rad_13); 
panel.add(rad_15); 
panel.add(label_n4); 
panel.add(rad_30); 
panel.add(label_3); 
panel.add(sum_n); 
panel.add(label_4); 
panel.add(sum); 
panel.add(sum_ok); 
/*Добавление кнопок на панель panel1*/
panel1.add(calc2); 
panel1.add(calc); 
/* 	rad_13 - компонент переключатель
	"."  - указывает, к какой переменной следует применить слушателя.
	addActionListener - добавление слушателя ActionListener к переключателю
	new - Оператор new создает экземпляр указанного класса 
	(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
	который будет отвечать за реагирование на события. 
	В нашем случае требуется идентифицировать событие нажатия на переключатель – путем щелчка мышью. 
	Поэтому будет использоваться интерфейс "ActionListener", 
	предназначенный для обработки событий "ActionEvent".
	Тело интерфейса указывается ниже, после фигурной скобки "{" 		*/ 
rad_13.addActionListener(new ActionListener() 
{ 
	/* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
		который реализуется путем простого вызова обработчика событий ActionPerformed.
		Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
		Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
	*/
public void actionPerformed(ActionEvent e) 
{ 
	/*Присвоение int_rad значение "a"*/
int_rad=a; 
/*Очистить текстовое поле*/
sum_n.setText("");
/*Очистить текстовое поле*/
sum.setText(""); 
} 
}); 
/* 	rad_13_1 - компонент переключатель
"."  - указывает, к какой переменной следует применить слушателя.
addActionListener - добавление слушателя ActionListener к переключателю
new - Оператор new создает экземпляр указанного класса 
(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
который будет отвечать за реагирование на события. 
В нашем случае требуется идентифицировать событие нажатия на переключатель – путем щелчка мышью. 
Поэтому будет использоваться интерфейс "ActionListener", 
предназначенный для обработки событий "ActionEvent".
Тело интерфейса указывается ниже, после фигурной скобки "{" 		*/ 
rad_13_1.addActionListener(new ActionListener() 
{  
public void actionPerformed(ActionEvent e) 
{ 
	/*присвоение int_rad значение "a1"*/
int_rad=a1; 
/*Очистить текстовое поле*/
sum_n.setText("");
/*Очистить текстовое поле*/
sum.setText(""); 
} 
}); 
/* 	rad_15 - компонент переключатель
"."  - указывает, к какой переменной следует применить слушателя.
addActionListener - добавление слушателя ActionListener к переключателю
new - Оператор new создает экземпляр указанного класса 
(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
который будет отвечать за реагирование на события. 
В нашем случае требуется идентифицировать событие нажатия на переключатель – путем щелчка мышью. 
Поэтому будет использоваться интерфейс "ActionListener", 
предназначенный для обработки событий "ActionEvent".
тело интерфейса указывается ниже, после фигурной скобки "{" 		*/ 
rad_15.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
{ 
	/*Присвоение int_rad значение "a2"*/
int_rad=a2; 
/*Очистить текстовое поле*/
sum_n.setText("");
/*Очистить текстовое поле*/
sum.setText("");  
} 
}); 
/* 	rad_30 - компонент переключатель
"."  - указывает, к какой переменной следует применить слушателя.
addActionListener - добавление слушателя ActionListener к переключателю
new - Оператор new создает экземпляр указанного класса 
(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
который будет отвечать за реагирование на события. 
В нашем случае требуется идентифицировать событие нажатия на переключатель – путем щелчка мышью. 
Поэтому будет использоваться интерфейс "ActionListener", 
предназначенный для обработки событий "ActionEvent".
тело интерфейса указывается ниже, после фигурной скобки "{" 		*/ 
rad_30.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
{ 
	/*Присвоение int_rad значение "a3"*/
int_rad=a3; 
/*Очистить текстовое поле*/
sum_n.setText("");
/*Очистить текстовое поле*/
sum.setText(""); 
} 
}); 
/* 	rad_35 - компонент переключатель
"."  - указывает, к какой переменной следует применить слушателя.
addActionListener - добавление слушателя ActionListener к переключателю
new - Оператор new создает экземпляр указанного класса 
(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
который будет отвечать за реагирование на события. 
В нашем случае требуется идентифицировать событие нажатия на переключатель – путем щелчка мышью. 
Поэтому будет использоваться интерфейс "ActionListener", 
предназначенный для обработки событий "ActionEvent".
тело интерфейса указывается ниже, после фигурной скобки "{" 		*/ 
rad_35.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
