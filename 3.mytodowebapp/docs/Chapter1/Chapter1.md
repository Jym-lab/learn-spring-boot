# Chapter 1.

## I. 서버 포트 변경하기
기본적으로 Tomcat 서버는 8080에서 작동한다.

만약 다른 포트로 바꾸고 싶다면, application.properties에 다음 코드를 추가하자.
```properties
server.port=8081
```
## II. Hello World 응답 받아보기

새 클래스를 추가해준다.

![00](img/00.png)

### SayHelloController.java
```java
package com.yjooanywhere.springboot.mytodowebapp.hello;

public class SayHelloController {
    //"say-hello" => "Hello World! What are you learning today?"

    //say-hello
    //http://localhost:8080/say-hello
    public String sayHello() {
        return "Hello World! What are you learning today?";
    }
}
```
웹 페이지 URL에 요청하면 다음 문자열을 리턴하는 메서드를 작성한다고 쳐보자.

say-hello라는 URL을 어떻게 매핑할 수 있을까?

@RequestMapping 어노테이션을 사용하면 된다. 매핑하려는 URL을 괄호에 입력해주자.

```java
@RequestMapping("say-hello")    
public String sayHello() {
    return "Hello World! What are you learning today?";
    }
```
그런 다음 URL에 접속해보면 오류가 나오는 걸 볼 수 있다.

![01](img/01.png)

자 먼저 이 애플리케이션은 /error에 대한 매핑이 없기에 이런 페이지가 나온다.

그리고 페이지를 찾을 수 없는 404 에러를 띄우고 있다.

이 현상은 Spring에게 페이지가 등록해주지 않아 생기는 문제다.

따라서 @Controller 어노테이션을 클래스에 추가해주어야 한다.

```java
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SayHelloController {
    //"say-hello" => "Hello World! What are you learning today?"
```

다음과 같이 추가해준다. 그리고 다시 확인해보면

![02](img/02.png)

에러 내용이 조금 변한걸 볼 수 있다.

Spring MVC는 기본적으로 @ResponseBody를 사용하지 않으면 해당 메서드의 반환 값을 뷰로 매핑한다.

좀 더 쉽게 설명하자면, [리턴 값].jsp 파일을 찾아서 HTML로 변환해 사용자에게 전달한다.

그런데 [리턴 값].jsp가 없으니 당연히 오류가 나는 수 밖에.

그래서 @ResponseBody를 사용하면 HTTP 응답 본문을 생성해 리턴 값을 담아 넘겨주게 된다.

다음과 같이 작성해주면 된다.

```java
@Controller
public class SayHelloController {
    //"say-hello" => "Hello World! What are you learning today?"

    //say-hello
    //http://localhost:8080/say-hello
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World! What are you learning today?";
    }
}
```

![03](img/03.png)

깔끔하게 나타난다.

## Spring MVC 컨트롤러 개선하기

![img.png](img/04.png)

스프링에서 HTML을 리턴할 때 이런 방식을 사용한다고 한다.

진짜 구리다 어떻게 이런 문법을 쓰지? 내용도 복잡하다.

그래서 뷰라는 것을 사용한다. jsp라는 확장자를 사용하는데

이 확장자를 Servelet으로 변환해주는 Tomcat-Embed-Jasper라는 컴파일러를 추가해야한다.

build.gradle에 다음 종속성을 추가해주자.

```groovy
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    // 여기 아래에 추가할 것!
    implementation 'org.apache.tomcat.embed:tomcat-embed-jasper'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
```

JSP를 사용하는 건 다음에 자세히 다뤄보자