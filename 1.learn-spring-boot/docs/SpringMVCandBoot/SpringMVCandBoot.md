# Spring과 Spring Boot 그리고 Spring MVC

## 🧐 무엇을 하는가?
이번에는 🚀 Spring Boot, 🕸️ Spring MVC 그리고 🌳 Spring Framework를 함께 살펴보도록 하자.

🌱 이 세 가지를 이해하고 각각 어떤 역할을 하는지, 어떻게 상호 작용하는지 알아보자.

이 세 가지가 어떻게 다르고, 어떻게 함께 사용되는지 이해함으로써

우리는 더욱 효율적이고 견고한 애플리케이션을 구축할 수 있게 될 것이다.

## 🌳 Spring Framework의 역할
Spring Framework의 핵심은 바로 Dependency Injection(의존성 주입)이다.

의존성을 정의하고 식별하여 자동으로 연결하는 역할을 수행한다.

이를 위해 다음과 같은 어노테이션들을 사용할 수 있다

* @Component
* @Autowired
* @Component Scan
* @Service

**의존성 정의**는 `@Component`나 `@Service` 어노테이션을 사용한다.

**의존성 식별**은 `@ComponentScan` 어노테이션을 사용해 특정 패키지의 정의된 모든 컴포넌트를 식별할 수 있다.

**의존성 주입**은 `@Autowired` 어노테이션을 사용해 컴포넌트와 의존성을 자동으로 연결할 수 있다.

이것이 바로 Spring Framework의 핵심 역할이다.

## 🕸️ Spring MVC의 역할

Spring MVC의 핵심은 웹 애플리케이션과 REST API 빌드 과정을 간소화 하는 것이다.

Spring MVC 이전에 사용하던 프레임워크는 Struts라는 것인데, 이걸 사용해 웹을 빌드하는 작업은 복잡했다.

Spring MVC를 사용하면 쉽게 빌드할 수 있으며 다음 어노테이션들을 사용할 수 있다:

* @Controller
* @RestController
* @RequestMapping(**URL할당**)

### 🙋 Controller와 RestController의 차이

Controller는 Spring의 전통적인 컨트롤러다. 

Model 객체에 데이터를 담고 View를 반환하는 역할을 한다. 

웹 페이지에 직접 데이터를 넘긴다고 생각하면 편하다.

반면, RestController는 객체만 반환하게 된다. 해당 객체는 JSON이나 XML 형식으로 사용자에게 전송된다.

## 🚀 Spring Boot 역할

Spring 프레임워크를 빌드하려면 다양한 설정도 해주어야 한다.

예를 들면 외부 라이브러리나 모듈을 하나의 애플리케이션으로 묶기 위해

build.gradle에 라이브러리들을 명시하거나 다양한 설정을 추가하거나 설정해야 한다.

Spring Boot는 이러한 복잡성을 줄여주고, 애플리케이션을 빠르게 빌드 할 수 있도록 지원한다.

좀 더 자세한 내용은 [Spring Boot의 구성과 목표](https://github.com/Jym-lab/learn-spring-boot/tree/main/1.learn-spring-boot/docs/SpringBootStart/SpringBootStart.md)를 참고하길 바란다. 👀
