package lesson_28;

public interface Series {
    int getNext(); //  возвращает следующий номер в последовательности
    void reset(); // сброс значения, возврат к начальному
    void setStart(int a);//  устанавливает начальное значение
}
