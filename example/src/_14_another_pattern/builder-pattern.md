## 빌더 패턴

![image-20220731190120338](/Users/addpage/Library/Application Support/typora-user-images/image-20220731190120338.png)

**빌더패턴**은 복잡한 객체를 단계별로 구성할 수 있는 생산적인 디자인 패턴입니다. 패턴을 사용하면 동일한 구성 코드를 사용하여 객체의 다양한 유형과 표현을 생성할 수 있습니다.



### 문제

![많은 하위 클래스가 또 다른 문제를 만듭니다.](https://refactoring.guru/images/patterns/diagrams/builder/problem1.png?id=11e715c5c97811f848c48e0f399bb05e)

***집 짓기를 위한 수많은 하위 클래스***

많은 필드와 중첩된 객체를 힘들게 단계별로 초기화해야 하는 복잡한 객체를 상상해 보세요.



![텔레스코핑 생성자](https://refactoring.guru/images/patterns/diagrams/builder/problem2.png?id=2e91039b6c7d2d2df6ee519983a3b036)

***매개변수가 거대한 생성자***

이러한 초기화 코드는 일반적으로 많은 매개변수가 있는 괴물 같은 생성자 내부에 묻혀 있습니다. 더 나쁜 점은 클라이언트 코드 전체에 흩어져 있습니다. 이는 리팩토링 중 [긴 파라미터의 냄새](https://refactoring.guru/smells/long-parameter-list)에 해당합니다.



### 해결

Builder 패턴은 객체 생성 코드를 추출하여 *builders* 라는 별도의 객체로 이동하도록 제안합니다.

![빌더 패턴 적용하기](https://refactoring.guru/images/patterns/diagrams/builder/solution1.png?id=8ce82137f8935998de802cae59e00e11)

패턴은 객체 구성을 일련의 단계( `buildWalls`, `buildDoor`등)로 구성합니다. 객체를 생성하려면 빌더 객체에 대해 이러한 일련의 단계를 실행합니다. **중요한 부분은 모든 단계를 호출할 필요가 없다는 것입니다.**



### 구조

![빌더 디자인 패턴의 구조](https://refactoring.guru/images/patterns/diagrams/builder/structure.png?id=fe9e23559923ea0657aa5fe75efef333)

1. `Builder` 인터페이스는 모든 유형의 빌더에 공통적인 제품 구성 단계를 선언합니다.
2. `Concrete Builder`는 건설 단계의 다양한 구현을 제공합니다. **공통 인터페이스에 따르지 않는 제품을 생산할 수도 있습니다.**
3. `Product`는 결과 객체입니다.
4. 나아가 `Director`라는 별도의 클래스로 빌더 단계에 대한 일련의 호출을 추출할 수 있습니다. 클라이언트 코드에서 제품 구성의 세부 정보를 아예 숨길 수 있습니다.

