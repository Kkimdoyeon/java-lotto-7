# java-lotto-precourse

## 기능 요구 사항 
- 로또 번호의 숫자 범위: 1~45
- 로또 1개당 중복되지 않는 6개의 숫자 뽑기
- 당첨번호 추첨 시, 중복되지 않는 숫자 6개와 보너스 번호 1개 뽑음
- 당첨은 1~5등까지 있음
  - 1등: 6개 번호 일치 / 2,000,000,000원
  - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
  - 3등: 5개 번호 일치 / 1,500,000원
  - 4등: 4개 번호 일치 / 50,000원
  - 5등: 3개 번호 일치 / 5,000원
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 로또를 발행해야 함
- 로또 1장의 가격은 1,000원
- 당첨 번호와 보너스 번호를 입력받음
- 사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료

# 기능 구현 목록
## 입력
- [x] 로또 구입 금액 입력받기
  - [x] **[예외처리]** 로또 구입 금액이 1,000원 단위로 나누어떨어지지 않을 때
  - [x] **[예외처리]** 로또 구입 금액이 1,000원 이하일 때
- [x] 당첨 번호 입력받기
  - [x] 중복되지 않는 숫자 6개
  - [x] **[예외처리]** 입력 받은 당첨 번호에 중복된 숫자가 있을 때
  - [x] **[예외처리]** 입력 받은 숫자가 6개 미만이거나 6개 초과일 때
  - [x] 쉼표(,) 기준으로 구분
  - [x] 쉼표 앞에 공백이 있을 경우도 정상 입력받게 처리
  - [x] **[예외처리]** 로또 번호가 1~45 사이의 숫자가 아닐 때
- [x] 보너스 번호 입력 받기
  - [x] **[예외처리]** 보너스 번호가 당첨 번호들 중 하나와 중복된 값일 때
  - [x] **[예외처리]** 보너스 번호가 1~45 사이의 숫자가 아닐 때

## 출력
- [x] 발행한 로또 수량 및 번호를 출력하기
  - [x] 로또 몇 장 구매할 수 있는지 계산
  - [x] 로또 번호는 오름차순으로 정렬하여 출력
- [x] 당첨 내역 출력하기
- [x] 수익률 출력
  - [x] 소수점 둘째 자리에서 반올림하기 

## test 
### model
- Balance
- [x] 알맞은 금액을 입력했을 때, Balance 객체가 잘 생성되는지
- [x] 1,000원 미만의 금액을 입력했을 때, 예외 출력
- [x] 1,000원 단위가 아닐 때, 예외 출력
- Bonus
- [x] 유효한 보너스 번호를 입력받았을 때, Bonus 객체가 올바르게 생성되는지
- [x] 1부터 45 사이의 범위를 벗어난 번호를 입력했을 때, 예외 출력
- [x] 보너스 번호가 이미 당첨 번호와 중복될 때, 예외 출력
- User
- [x] 로또 번호를 추가하고, getLottos() 메서드를 통해 올바르게 저장되는지 확인
- [x] Prize 값을 결과에 추가하고, getResults() 메서드를 통해 올바르게 업데이트되었는지
- [x] User 객체 생성 후 기본적으로 모든 Prize의 수가 0인지 확인
- Profit
- [x] Profit 객체를 생성했을 때 초기 profit과 profitRate가 0인지 확인
- [x] addProfit() 메서드를 통해 이익을 추가하고, getProfit() 메서드를 사용하여 올바르게 업데이트되었는지 확인
- [x] setProfitRate() 메서드를 사용하여 이익률을 설정하고, getProfitRate() 메서드를 통해 올바르게 설정되었는지 확인
- Lotto
- [x] 올바른 번호 리스트를 사용하여 Lotto 객체가 정상적으로 생성되는지 확인
- [x] 로또 갯수가 6개가 아닐 때, 예외 출력
- [x] 1에서 45 사이의 숫자가 아닌 번호를 사용했을 때, 예외 출력
- [x] 중복된 번호 입력했을 때, 예외 출력

# 프로그래밍 요구 사항 
- depth가 3이 넘지 않도록, 2까지만 허용
- 3항 연산자 쓰지 않기
- 함수가 `한 가지 일`만 하도록
  - 함수/메서드의 길이가 `15라인이 넘어가지 않게`
- JUnit 5와 AssertJ를 이용하여 테스트 코드로 확인
- else 예약어 쓰지 않기 
- Java `Enum` 사용하기!
- 구현한 기능에 대한 단위 테스트 작성
  - UI(System.out, System.in, Scanner) 로직은 제외