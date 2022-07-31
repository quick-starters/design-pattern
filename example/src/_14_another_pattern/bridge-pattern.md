## 브리지 패턴

<img src="https://refactoring.guru/images/patterns/content/bridge/bridge.png?id=bd543d4fb32e11647767301581a5ad54" alt="다리 디자인 패턴" style="zoom:150%;" />

**브리지 패턴**은 밀접하게 관련된 클래스 집합을 서로 독립적으로 개발할 수 있는 두 개의 개별 계층(추상화 및 구현)으로 분할할 수 있는 구조적 디자인 패턴입니다.



### 문제

두 개의 하위 클래스(`Circle`, `Square`) 및 가 있는 기하학적 클래스 `Shape`가 있다고 가정합시다. 이 클래스 계층 구조를 확장하여 색깔을 칠하기 위해 하위 클래스(`Red`, `Blue`)를 만들 계획입니다. 그러나 이미 2개의 하위 클래스가 있으므로 `RedSquare`, `BlueCircle`와 같은 4개의 클래스 조합을 생성해야 합니다 .

<img src="https://refactoring.guru/images/patterns/diagrams/bridge/problem-en.png?id=81f8ed6e6f5d673e15203b22a7a3c502" alt="브리지 패턴 문제"  />

***클래스 조합의 수는 기하급수적으로 증가합니다.***

계층 구조에 새로운 모양과 색상을 추가하면 클래스 수가 기하급수적으로 증가합니다. 예를 들어, 삼각형 모양을 추가하려면 각 색상에 대해 하나씩 두 개의 하위 클래스를 도입해야 합니다. 그리고 그 후에 새 색상을 추가하려면 각 모양 유형에 대해 하나씩 세 개의 하위 클래스를 만들어야 합니다.



### 해결

이 문제는 형태와 색상의 두 가지 독립적인 차원에서 `Shape` 클래스를 확장하려고 하기 때문에 발생합니다. 이것은 클래스 상속과 관련된 매우 일반적인 문제입니다.

**Bridge 패턴은 상속에서 객체 합성으로 전환하여 이 문제를 해결**하려고 합니다. 이것이 의미하는 바는 차원 중 하나를 별도의 클래스 계층으로 추출하여 원래 클래스가 한 클래스 내에서 모든 상태와 동작을 갖는 대신 새 계층의 개체를 참조하도록 한다는 것입니다.

<img src="https://refactoring.guru/images/patterns/diagrams/bridge/solution-en.png?id=b72caae18c400d6088072f2f3adda7cd" alt="Bridge 패턴이 제안하는 솔루션" style="zoom:150%;" />

***여러 관련 계층으로 변환하여 클래스 계층의 폭발적 증가를 방지할 수 있습니다.***

이 접근 방식에 따라 색상 관련 코드를 두 개의 하위 클래스(`Red`, `Blue`)가 있는 자체 클래스`Color`로 추출할 수 있습니다. 그런 다음 `Shape` 클래스는 색상 객체 중 하나를 가리키는 참조 필드를 가져옵니다. 이제 `Shape`는 연결된 색상 객체에 색상 관련 작업을 위임할 수 있습니다. 해당 참조는 `Shape`와 `Color` 클래스 사이의 다리 역할을 합니다. 이제부터 새 색상을 추가할 때 모양 계층 구조를 변경할 필요가 없으며 그 반대의 경우도 마찬가지입니다.



### 구조

<img src="https://refactoring.guru/images/patterns/diagrams/bridge/structure-en.png?id=827afa4b40008dc29d26fe0f4d41b9cc" alt="다리 디자인 패턴" style="zoom:150%;" />

1. `Abstraction`은 높은 수준의 제어 논리를 제공합니다. 실제 저수준 작업을 수행하기 위해 구현 객체에 의존합니다.
2. `Implementation`은 모든 구체적인 구현에 공통적인 인터페이스를 선언합니다. `Abstraction`는 여기에 선언된 메서드를 통해서만 `Implementation` 객체와 통신할 수 있습니다.

3. `Concrete Implementations`에는 플랫폼별 코드 가 포함됩니다.
4. `Client`는 추상화 작업에만 관심이 있습니다. 그러나 추상화 객체를 구현 객체중 하나와 연결하는 것은 클라이언트의 작업입니다.