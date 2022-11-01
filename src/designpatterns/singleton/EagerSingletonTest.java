package designpatterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EagerSingletonTest {
    @Test
    public void testEagerSingleton() {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();

        Assertions.assertInstanceOf(EagerSingleton.class, eagerSingleton);
    }

    @Test
    public void testTwoInstancesShouldBeTheSame() {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();

        Assertions.assertEquals(instance1, instance2);
    }
}