## AWS + web 구축 연습

-  출처 : 스프링 부트와 AWS로 혼자 구현하는 웹 서비스

## 기본 환경 

- Gradle 4.10.2 버전
- Spring Boot 2.1.7 버전

## Spring Data JPA
+ Spring Data JPA 사용
  + 구현체 Hibernate, Eclipse, Link 등을 직접 사용하지 않음
  + Spring Data JPA라는 모듈로 JPA를 다룬다. 
+ 장점
  + 구현체를 교체 용이
  + 저장소 교체 용이 
    + ex) Spring Data JPA -> Spring Data MongoDB, Spring Data Redis
      
## Spring Web 계층 

- Web Layer : @Controller, JSP, 뷰 템플릿
  - DTOs : 계층간 데이터 교환을 위한 객체
- Service Layer : @Service, @Transactional 
- Repository Layer : DAO, Databases access 영역
  - Domain Model : 개발 대상 단순화 시킨 것(ex/ 택시앱 - 배차, 탑승, 요금)
  - 


