package ru.sbertech.test.Lesson8.HomeWork;

import org.junit.Before;
import org.junit.Test;
import ru.sbertech.test.Lesson3.Person;

import java.util.ArrayList;
import java.util.Iterator;

import static ru.sbertech.test.Lesson8.HomeWork.MyIterator.getIterator;

/**
 * Created by svetlanashmalko on 07.08.16.
 */
public class Test1 {

   @Before
    public static void setUp () {

        ArrayList<Person> persons =new ArrayList<Person>();
                persons.add(new Person(1L,"Байда Илья Вадимович","79185551234"));
                persons.add(new Person(2L,"Истамов Аскар Зохитович","79185551233"));
                persons.add(new Person(3L,"Кириловский Сергей Владимирович","79185551232"));
                persons.add(new Person(5L,"Коджаев Шамиль Амил оглы","79185551231"));
                persons.add(new Person(4L,"Нешин Антон Сергеевич","79185551230"));
                persons.add(new Person(6L,"Орловский Николай Михайлович","79185551229"));
                persons.add(new Person(7L,"Павлов Иван Геннадьевич","79185551228"));
                persons.add(new Person(8L,"Романюта Александр Сергеевич","79185551227"));
                persons.add(new Person(9L,"Комягин Денис Михайлович","79185551226"));
                persons.add(new Person(9L,"Комягин Денис Михайлович","79185551226"));
                persons.add(new Person(10L,"Чернявский Александр Игоревич","79185551225"));
                persons.add(new Person(11L,"Шмалько Светлана Григорьевна","79185551224"));
                persons.add(new Person(12L,"Малеванный Михаил Сергеевич","79185551223"));
                persons.add(new Person(13L,"Малахова Елена Александровна","79185551222"));
                persons.add(new Person(14L,"Плешаков Владимир Владимирович","79185551221"));
                persons.add(new Person(15L,"Жовнир Екатерина Юрьевна","79185551220"));
                persons.add(new Person(16L,"Смолянинова Дарья Дмитриевна","79185551219"));

            }
    @Test








    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7};

        Iterator<Integer> integerIterator = getIterator(integers);

        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
            //System.out.println(integerIterator.prevEl()); не видит этот метод
        }
    }
}
