package lotto.exception;

public class InvalidBonusDuplicateException extends IllegalArgumentException {

    public InvalidBonusDuplicateException() {
        super("[ERROR] 보너스 번호는 당첨 번호와 중복될 수 없습니다.");
    }
}