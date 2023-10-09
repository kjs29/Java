We have

```java
ArrayList<String> house = new ArrayList<String>(Arrays.asList("dirt", "furniture", "tv", "dirt", "dirt", "plant", "lamp"));
```

We want to remove all dirt in the `house`.


<details>

  <summary>answer</summary>

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Abc {
    public static void main(String[] args){
        ArrayList<String> house = new ArrayList<String>(Arrays.asList("dirt", "furniture", "tv", "dirt", "dirt", "plant", "lamp"));
        System.out.println(house);
        for (int i=house.size()-1;i>=0;i--) {
            if (house.get(i) == "dirt") {
                house.remove(i);
            }
        }
        System.out.println(house);
    }
}
```

</details>


<details>

  <summary>answer 2</summary>

```java
import java.util.ArrayList;

public class Abc {
    public static void main(String[] args){
        ArrayList<String> house = new ArrayList<String>(Arrays.asList("dirt", "furniture", "tv", "dirt", "dirt", "plant", "lamp"));
        int counter = 0;
        while (counter < house.size()) {
            if (house.get(counter) == "dirt") {
                house.remove(counter);
                continue;
            }
            counter++;
        }
        System.out.println(house);
    }
}
```

</details>
