import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.Assert.*;


public class MyHashMapTest {
    MyHashMap<String, User> myHashMap;
    HashMap<String, User> hashMap;
    User user1;
    User user2;
    User user3;
    User user4;
    User user5;
    User user6;
    User user7;
    User user8;
    User user9;
    User user10;
    User user11;
    User user12;
    User user13;
    User user14;
    User user15;
    User user16;
    User user17;
    User user18;
    User user19;
    User user20;
    User user21;
    User user22;
    User user23;
    User user24;
    User user25;
    User user26;
    User user27;
    User user28;
    User user29;
    User user30;
    User user31;
    User user32;
    User user33;
    User user34;
    User user35;
    User user36;
    User user37;
    User user38;
    User user39;
    User user40;

    @Before
    public void init() {
        myHashMap = new MyHashMap();

        hashMap = new HashMap<>();

        user1 = User.builder()
                .name("Anna")
                .age(15)
                .city("Moskow")
                .build();

        user2 = User.builder()
                .name("Petr")
                .age(37)
                .city("St.Peterburg")
                .build();

        user3 = User.builder()
                .name("Ivan")
                .age(29)
                .city("Kazan")
                .build();

        user4 = User.builder()
                .name("Mariya")
                .age(24)
                .city("Kazan")
                .build();

        user5 = User.builder()
                .name("Fedor")
                .age(41)
                .city("St.Peterburg")
                .build();

        user6 = User.builder()
                .name("Victor")
                .age(37)
                .city("Nab.Chelny")
                .build();

        user7 = User.builder()
                .name("Victor")
                .age(36)
                .city("Nab.Chelny")
                .build();


        user8 = User.builder()
                .name("Petr")
                .age(96)
                .city("Nizhnekamsk")
                .build();

        user9 = User.builder()
                .name("Petr")
                .age(96)
                .city("Nizhnekamsk")
                .build();

        user10 = User.builder()
                .name("Nataliya")
                .age(16)
                .city("Chistopol")
                .build();

        user11 = User.builder()
                .name("Svetlana")
                .age(23)
                .city("Alekseevsk")
                .build();

        user12 = User.builder()
                .name("Sergey")
                .age(36)
                .city("Voronezh")
                .build();

        user11 = User.builder()
                .name("Olga")
                .age(41)
                .city("Moskow")
                .build();

        user12 = User.builder()
                .name("Vasiliy")
                .age(39)
                .city("Moskow")
                .build();

        user12 = User.builder()
                .name("Stepan")
                .age(27)
                .city("Voronezh")
                .build();


        user12 = User.builder()
                .name("Aleksey")
                .age(34)
                .city("Voronezh")
                .build();

        user12 = User.builder()
                .name("Oleg")
                .age(38)
                .city("Nab.Chelny")
                .build();

        user13 = User.builder()
                .name("Stanislav")
                .age(12)
                .city("Nab.Chelny")
                .build();

        user14 = User.builder()
                .name("Vladimir")
                .age(56)
                .city("Moskow")
                .build();

        user15 = User.builder()
                .name("Vlad")
                .age(56)
                .city("Moskow")
                .build();

        user16 = User.builder()
                .name("Vlad")
                .age(56)
                .city("Moskow")
                .build();

        user17 = User.builder()
                .name("Tatyana")
                .age(43)
                .city("Nab.Chelny")
                .build();

        user18 = User.builder()
                .name("Sofiya")
                .age(57)
                .city("Volgorod")
                .build();

        user19 = User.builder()
                .name("Olesya")
                .age(36)
                .city("Nab.Chelny")
                .build();

        user20 = User.builder()
                .name("Vitaliy")
                .age(14)
                .city("Voronezh")
                .build();

        user21 = User.builder()
                .name("David")
                .age(19)
                .city("Sochi")
                .build();

        user22 = User.builder()
                .name("Dinar")
                .age(19)
                .city("Kazan")
                .build();

        user23 = User.builder()
                .name("Yana")
                .age(72)
                .city("Alekseevsk")
                .build();

        user24 = User.builder()
                .name("Ylyana")
                .age(43)
                .city("Almetyevsk")
                .build();

        user25 = User.builder()
                .name("Airat")
                .age(9)
                .city("Cheboksary")
                .build();

        user26 = User.builder()
                .name("Vera")
                .age(19)
                .city("Moskow")
                .build();

        user27 = User.builder()
                .name("Ilya")
                .age(23)
                .city("Lipetck")
                .build();


        user28 = User.builder()
                .name("Sonya")
                .age(27)
                .city("Penza")
                .build();


        user29 = User.builder()
                .name("Nina")
                .age(37)
                .city("Sverdlovsk")
                .build();

        user30 = User.builder()
                .name("Semen")
                .age(69)
                .city("Chistopol")
                .build();

        user31 = User.builder()
                .name("Svetoslav")
                .age(59)
                .city("Sevostopol")
                .build();

        user32 = User.builder()
                .name("Maxim")
                .age(59)
                .city("Penza")
                .build();

        user33 = User.builder()
                .name("Anton")
                .age(19)
                .city("Nizhnekamsk")
                .build();

        user34 = User.builder()
                .name("Andrey")
                .age(24)
                .city("Moskow")
                .build();

        user35 = User.builder()
                .name("Rustam")
                .age(36)
                .city("Nurlat")
                .build();

        user36 = User.builder()
                .name("Yaroslav")
                .age(36)
                .city("Novgorod")
                .build();

        user37 = User.builder()
                .name("Polina")
                .age(17)
                .city("St.Peterburg")
                .build();

        user38 = User.builder()
                .name("Yan")
                .age(90)
                .city("Moskow")
                .build();

        user39 = User.builder()
                .name("Erik")
                .age(25)
                .city("Niznekamsk")
                .build();

        user40 = User.builder()
                .name("Shamil")
                .age(10)
                .city("Kampolyany")
                .build();
    }

    @Test
    public void hashMapEmptyTrue() {
        assertTrue(myHashMap.isEmpty());

    }

    @Test
    public void hashMapEmptyFalse() {
        myHashMap.put(user1.getName(), user1);
        assertFalse(myHashMap.isEmpty());

    }

    @Test
    public void putTest() {
        myHashMap.put(user1.getName(), user1);
        hashMap.put(user1.getName(), user1);
        myHashMap.put(user2.getName(), user2);
        hashMap.put(user2.getName(), user2);

        assertEquals(hashMap.size(), myHashMap.size());

    }


    @Test
    public void putManyTest() {
        myHashMap.put(user1.getName(), user1);
        myHashMap.put(user2.getName(), user2);
        myHashMap.put(user3.getName(), user3);
        myHashMap.put(user4.getName(), user4);
        myHashMap.put(user5.getName(), user5);
        myHashMap.put(user6.getName(), user6);
        myHashMap.put(user7.getName(), user6);
        myHashMap.put(user8.getName(), user8);
        myHashMap.put(user9.getName(), user9);
        myHashMap.put(user10.getName(), user10);
        myHashMap.put(user11.getName(), user11);
        myHashMap.put(user12.getName(), user12);
        myHashMap.put(user13.getName(), user13);
        myHashMap.put(user14.getName(), user14);
        myHashMap.put(user15.getName(), user15);
        myHashMap.put(user16.getName(), user16);
        myHashMap.put(user17.getName(), user17);
        myHashMap.put(user18.getName(), user18);
        myHashMap.put(user19.getName(), user19);
        myHashMap.put(user20.getName(), user20);
        myHashMap.put(user21.getName(), user21);
        myHashMap.put(user22.getName(), user22);
        myHashMap.put(user23.getName(), user23);
        myHashMap.put(user24.getName(), user24);
        myHashMap.put(user25.getName(), user25);
        myHashMap.put(user26.getName(), user26);
        myHashMap.put(user27.getName(), user27);
        myHashMap.put(user28.getName(), user28);
        myHashMap.put(user29.getName(), user29);
        myHashMap.put(user30.getName(), user30);
        myHashMap.put(user31.getName(), user31);
        myHashMap.put(user32.getName(), user32);
        myHashMap.put(user33.getName(), user33);
        myHashMap.put(user34.getName(), user34);
        myHashMap.put(user35.getName(), user35);
        myHashMap.put(user36.getName(), user36);
        myHashMap.put(user37.getName(), user37);
        myHashMap.put(user38.getName(), user38);
        myHashMap.put(user39.getName(), user39);
        myHashMap.put(user40.getName(), user40);

        assertEquals(18, myHashMap.size());
    }


    @Test
    public void putDoubleTest() {
        myHashMap.put(user1.getName(), user1);
        myHashMap.put(user2.getName(), user2);
        myHashMap.put(user3.getName(), user3);
        myHashMap.put(user2.getName(), user2);

        assertEquals(3, myHashMap.size());

    }

    @Test
    public void putСollisionTest() {
        myHashMap.put(user1.getName(), user1);
        myHashMap.put(user2.getName(), user2);
        myHashMap.put(user3.getName(), user3);
        myHashMap.put(user4.getName(), user4);
        myHashMap.put(user5.getName(), user5);
        myHashMap.put(user6.getName(), user6);
        myHashMap.put(user7.getName(), user7);
        assertEquals(5, myHashMap.size());
    }

    @Test
    public void keySetTest() {
        myHashMap.put(user1.getName(), user1);
        myHashMap.put(user2.getName(), user2);
        myHashMap.put(user3.getName(), user3);
        myHashMap.put(user4.getName(), user4);
        myHashMap.put(user5.getName(), user5);
        myHashMap.put(user6.getName(), user6);
        myHashMap.put(user7.getName(), user7);

        Set<String> keys = new LinkedHashSet<>();
        keys.add(user1.getName());
        keys.add(user2.getName());
        keys.add(user3.getName());
        keys.add(user4.getName());
        keys.add(user5.getName());
        keys.add(user6.getName());
        keys.add(user7.getName());

        Set<String> keysMap = myHashMap.keySet();

        assertEquals(keys, keysMap);

    }

    @Test
    public void getTest() {
        myHashMap.put(user1.getName(), user1);
        myHashMap.put(user2.getName(), user2);
        myHashMap.put(user3.getName(), user3);
        myHashMap.put(user4.getName(), user4);
        myHashMap.put(user5.getName(), user5);
        myHashMap.put(user6.getName(), user6);
        myHashMap.put(user7.getName(), user7);

        User user = myHashMap.get(user4.getName());
        assertEquals(user4, user);
        User userSeven = myHashMap.get(user7.getName());
        assertEquals(user7, userSeven);
    }

    @Test
    public void removeTest() {
        myHashMap.put(user1.getName(), user1);
        myHashMap.put(user2.getName(), user2);
        myHashMap.put(user3.getName(), user3);

        myHashMap.remove(user2.getName());

        Set<String> keys = new LinkedHashSet<>();
        keys.add(user1.getName());
        keys.add(user2.getName());
        keys.add(user3.getName());

        keys.remove(user2.getName());

        assertEquals(keys, myHashMap.keySet());
    }

    @Test
    public void clearTest() {
        myHashMap.put(user1.getName(), user1);
        myHashMap.put(user2.getName(), user2);
        myHashMap.put(user3.getName(), user3);
        myHashMap.put(user4.getName(), user4);

        myHashMap.clear();

        assertTrue(myHashMap.isEmpty());

    }

    @Test
    public void valuesTest() {
        myHashMap.put(user1.getName(), user1);
        myHashMap.put(user2.getName(), user2);
        myHashMap.put(user3.getName(), user3);
        myHashMap.put(user4.getName(), user4);

        hashMap.put(user1.getName(), user1);
        hashMap.put(user2.getName(), user2);
        hashMap.put(user3.getName(), user3);
        hashMap.put(user4.getName(), user4);


        assertEquals(hashMap.values().size(), myHashMap.values().size());
    }

    @Test
    public void putNullKeyTest() {
        myHashMap.put(null, user4);
        hashMap.put(null, user4);

        assertEquals(hashMap.size(), myHashMap.size());

    }

    @Test
    public void putNullValueTest() {
        myHashMap.put(user8.getName(), null);
        hashMap.put(user8.getName(), null);

        assertEquals(hashMap.size(), myHashMap.size());

    }
}


