<그림>

## 팩토리 패턴(Factory Pattern)
<클래스 다이어그램>

<패턴 설명>

알고리즘 군을 정의하고 **캡슐화**해서 각각의 **알고리즘군을 수정**해서 쓸 수 있게 해줍니다. 전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있습니다. 새로운 알고리즘이 필요하더라도, 컨텍스트를 수정하지 않고 기능을 추가 할 수 있게 됩니다.



> **객체지향 디자인 원칙 3.** 
>
> 구현보다는 인터페이스에 맞춰서 프로그래밍한다.

특정 구현을 바탕으로 프로그래밍하면 안된다. 즉 특정 구현 사용하는거 아니냐? 구상 클래스를 코딩하면 나중에 코드를 수정할 가능성이 커지고 유연성이 떨어진다. 구상 클래스가 없다면 다음 같이 만들 수 밖에 없다. 컴파일 전까지는 어떤 것의 인스턴스를 만들어야할지 모른다.

```java
Duck duck;
if (picnic) {
  duck = new MallardDuck();
} else if (hunting) {
  duck = new DecoyDuck();
} else if (inBathTub) {
  duck = new RubberDuck();
}
```

이런 코드는 변경하거나 확장 시 코드를 다시 확인 후 새로운 코드를 추가하거나 기존 코드를 삭제해야함. 이러면 관리 갱신이 어려워지고 오류가 생길 가능성이 높아진다.

> `new`에는 문제가 없다. 말썽을 일으키는 것은 `변화`다.





---

### 실습 코드

#### 1. 예시코드 확인 (_01_before)

![스크린샷 2022-07-02 오후 3.30.30](images/1.png)

```java
public Pizza orderPizza(String type) throws Exception {
  Pizza pizza;

  // 변하는 코드
  if (type.equals("cheese")) {
    pizza = new CheesePizza();
  } else if (type.equals("greek")) {
    pizza = new GreekPizza();
  } else if (type.equals("pepperoni")) {
    pizza = new PepperoniPizza();
  } else {
    throw new Exception("잘못된 피자 타입입니다");
  }

  pizza.prepare();;
  pizza.bake();
  pizza.cut();
  pizza.box();

  return pizza;
}
```

피자 주문 예제. 피자 종류를 전달 받아 종류에 따라 인스턴스를 만들어 대입 피자 타입이 추가될 때마다 클라이언트 코드 변경 일어남



#### 2. 변하는 부분 추상화 (_02_encapsulation)

![image-20220709153638542](images/image-20220709153638542.png)

```java
public Pizza orderPizza(String type) {
  Pizza pizza;

  pizza = factory.createPizza(type);

  pizza.prepare();;
  pizza.bake();
  pizza.cut();
  pizza.box();

  return pizza;
}
```



> 결국 다른 객체로 문제를 옮긴거 아냐?

> 팩토리 정적 메서드



#### 3. 다양한 팩토리 만들기 (_03_factory_diversify)



```
/**
 * 팩토리 메소드
 *
 * @implNote
 * 구상 클래스 인스턴스를 하나의 객체가 전부 처리하는 방식에서, 일련의 서브 클래스가 처리하는 방식으로 변했다.
 * 팩토리 메소드는 객체 생성을 서브 클래스에 캡슐화함으로서, 슈퍼클래스에 있는
 * 클라이언트 코드와 서브클래스에 있는 객체 생성 코드를 분리할 수 있게한다.
 */
```



#### 4. 캡슐화 (_04_encapsulation)

![image-20220702154233940](images/image-20220702154233940.png)

소프트웨어는 아무리 디자인을 잘한다 한들 시간이 지남에 따라 **변화**하고 성장한다. 이런 소프트웨어를 고칠 때 기존 코드에 미치는 영향을 최소한으로 줄이면서 작업할 수 있는 방법이 있다면 정말 행복할 것이다. 

3가지 디자인 원칙을 알아보자.

**디자인 원칙 1**

애플리케이션에서 달라지는 부분을 찾아내고 달라지지 않는 부분과 분리한다. 즉 `캡슐화`한다.

- 이 원칙을 지키면 바뀌는 부분은 따로 뽑아서 캡슐화하기 때문에 나중에 바뀌지 않는 부분에 영향을 미치지 않고 그 부분만 고치거나 확장할 수 있게 된다.

**디자인 원칙 2**

구현보다는 인터페이스 맞춰서 프로그래밍한다.

- 이전 방법은 특정 구현에 의존했기 때문에 코드를 추가하지 않는 이상 행동을 변경할 여지가 없었다. 행동을 특정 행동 인터페이스를 구현한 별도 클래스 안에 넣으면 `Duck` 클래스에서는 그 행동을 구체적으로 구현할 필요가 없다.

**디자인 원칙 3**

상속보다는 구성을 활용한다.

- 구성을 활용하면 `A는 B이다(상속)`가 아닌 `A에는 B가 있다.(구성)` 을 통해 시스템 유연성을 향상 시킬 수 있다. 단순히 알고리즘 군을 별도의 클래스 집합으로 캡슐화할 수 있으며 구성 요소로 사용하는 객체에서 올바른 행동 인터페이스를 구현하기만 하면 실행 시에 행동을 바꿀 수도 있다.

---

### 자바에서의 전략 패턴

**Comparator**

```java
List<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(5);
numbers.add(3);

Order.sort(numbers, new Comparator<Integer>() {
  @Override
  public int compare(Integer o1, Integer o2) {
    return o1 - 02;
  }
});
System.out.println("numbers = " + numbers);
```

### 스프링에서의 전략패턴

인터페이스가 쓰인 곳 대부분이 전략 패턴이라고 보면된다.

**ApplicationContext**

```java
ApplicationContext context1 = new ClassPathXmlApplicationContext();
ApplicationContext context2 = new FileSystemApplicationContext();
ApplicationContext context3 = new AnnotationConfigApplicationContext();
```

빈 설정 파일을 클래스 패스에서 xml 파일을 읽어서, 파일 시스템 경로 기준으로 찾아서, 자바 어노테이션 설정 파일을 사용해서 등등 다양한 전략을 이용해 어플리케이션 컨텍스트를 구성할 수 있다. 그 외에 `BeanDefinitionParser`, `PlatformTransactionManager`, `CacheManager` 등도 전략 패턴을 사용한다.

---

### 장/단점

#### 장점
- 새로운 전략을 취하더라도 기존 코드(컨텍스트)를 바꾸지 않는다.
- 상속대신 위임을 사용할 수 있다.
- 런타임에 전략을 변경할 수 있다.

#### 단점
- 복잡도가 증가한다.
- 클라이언트 코드가 구체적 전략을 알아야한다.

  ```java
  Duck duck = new MallardDuck();
  duck.setFlyBehavior(new FlyNoWay());
  duck.setFlyBehavior(new FlyRocketPowered());
  ...
  ```

---

### 이야깃거리

- 람다 나오면서 좀더 패턴 쓰기 편해졌다.
- 코틀린 쓰면 더 활용하기 쉽다.
- [Enum을 통한 전략 패턴 사용을 많이 한다.](https://duzi077.tistory.com/234)

