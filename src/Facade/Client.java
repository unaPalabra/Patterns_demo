package Facade;

class Client{
    public static void main(String[] args) {
        // нам не нужно теперь создавать экземпл€ры всех классов-ингредиентов, помнить в какой последовательности нужно выполн€ть методы этих объектов.
        Facade facade = new Facade();// нам нужно только создать объект класса Facade и вызвать метод getDough().
        facade.getDough(500, 200, 200, 800);
    }
}
