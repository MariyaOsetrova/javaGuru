package guru.qa;

public class WebSite { // класс веб сайт
    // ОПИСАНИЕ СВОЙСТВ ОБЪЕКТА, полей класса
    // есть url
    String url;
    // Посетители на нем
    int viewCount;
    // рабочий, или новостной
    boolean isFunnySite;
    String[] menuItems = {"Login","logout","profile"}; // сразу проинициализироыали, без new String[3] //массив, с определенной длиной

// КОНСТРУКТОР, инициализируем переменные, которым нужно присоить значения НЕ ПО УМОЛЧАНИЮ
// *По умолчанию под капотом создается конструктор при добавлении переменных*/

    /*    public WebSite() {
        this.viewCount = 0;
        this.url = null;
        this.isFunnySite = false;
    }*/


    public WebSite(String url, boolean isFunnySite) {
        this.url = url;
        this.isFunnySite = isFunnySite;
    }

    public WebSite() { // добавляем пустой конструктор, елси понимаем.
        // что нужен пустой  класс        WebSite webSite =  new WebSite();

    }

// МЕТОД - ОПИСАНИЕ, ПОВЕДЕНИЯ ОБЪЕКТА, вызывается для конкретного объекта, работа с данными КОНКРЕТНОГО объекта
 // МЕТОД вызывается из ОБЪЕКТА
    // void метод ничего не возвращает
    // boolean из метода будет возвращаться тип boolean
    void open(){
        System.out.println("Открыт");
        if(isFunnySite){
            System.out.println("веселый смайлик");
        }else {
            System.out.println("грусный смайлик");
        }
    }

    void  setViewCount(int count){ // принимать из вне число просмотров и присваивать число
        if(viewCount>0 || isFunnySite) {
            System.out.println("viewCount>0");
        }else {

            this.viewCount = count;// присвоение новых данных
        }
    }
    boolean isFunnySite(){ // из метода будет возвращаться тип boolean
        return isFunnySite; //то что будет возвращено по окончнаию метода
    }

    void printItems(){ // цикл. существует 4 вида
        //1
        for (int i=0;i<menuItems.length; i++) // длина массива i<menuItems.length, в текущем длина 3: 0,1,2
        {
            System.out.println(menuItems[i]);
            //можно что-то положить в индекс
            menuItems[2] = "поменяла значение в индексе";
        }
        //2
        // если без индекса
        for (String menuItem : menuItems) { //iter
            System.out.println(menuItems);
        }

        // 3
        int i =0;
        while (i < menuItems.length){ // сначала проверяем условие
            System.out.println("Третий вид цикла");
             i++;
        }

        // 4
        i=0;
        do { // do обязательно 1 раз выполнится, но в while можем не попасть
            System.out.println("Четвернтый вид цикла");
            i++;
        }while (i < menuItems.length-1); // потом проверяем условие // Итог 0 и 1, 2 не выведится
    }
}
