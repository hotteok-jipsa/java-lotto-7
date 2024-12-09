# java-lotto-precourse

- [x] 구입금액 입력 안내 문구를 출력한다.
  - `구입금액을 입력해 주세요.`


- [x] 구입금액을 입력받는다.


-  구입금액이 올바른지 검사한다.
   - [x] 구입금액이 숫자타입이 아니라면 예외를 발생시킨다.
     - [ ] "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
   - [x] 구입금액이 1,000원으로 나누어 떨어지지 않는 경우 예외를 발생시킨다.
     - [ ] "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.


- [x] 구입 갯수만큼 로또를 발행한다.
  - 로또 번호의 숫자 범위는 1~45까지 이다. 
    - [x] 로또 번호의 숫자 범위가 1~45가 아니라면 예외를 발생시킨다.
      - [ ] "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
  - 로또 번호 추첨 시 중복되지 않는 숫자 6개를 뽑는다.
    - [x] 로또 번호에 중복이 존재한다면 예외를 발생시킨다.
      - [ ] "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
    - [x] 로또 번호가 6개가 아니라면 예외를 발생시킨다.
        - [ ] "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.


- [x] 발행한 로또의 갯수를 출력한다.
  - `8개를 구매했습니다.`


- [x] 발행한 로또 번호를 오름차순으로 정렬하여 출력한다.
  - `[8, 21, 23, 41, 42, 43]` 


- [x] 당첨 번호 입력 안내 문구를 출력한다.
  - `당첨 번호를 입력해 주세요.`


- [x] 당첨 번호를 입력받는다.


- [x] 당첨 번호를 쉼표(,)를 기준으로 구분하고 숫자타입인지 검사한다.
    - 당첨 번호의 숫자 범위는 1~45까지 이다.
        - [x] 당첨 번호의 숫자 범위가 1~45가 아니라면 예외를 발생시킨다.
            - [ ] "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
    - 당첨 번호 추첨 시 중복되지 않는 숫자 6개를 뽑는다.
        - [x] 당첨 번호에 중복이 존재한다면 예외를 발생시킨다.
            - [ ] "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
        - [x] 당첨 번호가 6개가 아니라면 예외를 발생시킨다.
            - [ ] "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.


- [x] 보너스 번호 입력 안내 문구를 출력한다.
  - `보너스 번호를 입력해 주세요.`


- [x] 보너스 번호를 입력받는다.
    - [x] 보너스 번호의 숫자 범위가 1~45가 아니라면 예외를 발생시킨다.
      - [ ] "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
    - [x] 보너스 번호가 당첨 번호 6개와 중복이 존재한다면 예외를 발생시킨다.
      - [ ] "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.


- [x] 당첨 통계 안내 문구를 출력한다.
```
당첨 통계
---
```


- [x] 로또 번호와 겹치는 당첨 번호와 보너스 번호의 갯수를 통해 결과를 계산한다.


- [x] 로또 결과들을 통해 당첨 내역을 계산한다.


- [x] 당첨 내역을 출력한다.


- [x] 당첨 내역에 따른 총 수익을 계산한다.


- [ ] 총 수익에서 구입금액을 나눈 수익률을 소수점 둘째 자리에서 반올림하여 출력한다.
  - `총 수익률은 62.5%입니다.`