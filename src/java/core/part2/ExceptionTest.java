package java.core.part2;

/**
 * Created by innopolis on 15.01.2017.
 * Код не скомпилируется. Все исключения в java наследуются от Throwable. В нескольких блоках catch обработка исключений должна идти вверх по иерархии исключений
 * (в данном случае от более конкретного - UnsupportedOperationException до более общего - Throwable, но не наоборот).
 */
public class ExceptionTest {
    public static void main(String[] args) {
       /* try {
            throw new UnsupportedOperationException();
        } catch(Throwable t) {
            System.out.print("1");
        } catch(Exception e) {
            System.out.print("2");
        } catch(UnsupportedOperationException uoe) {
            System.out.print("3");
        }*/
    }
}
