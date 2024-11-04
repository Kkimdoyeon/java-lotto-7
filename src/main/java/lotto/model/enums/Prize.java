package lotto.model.enums;

public enum Prize {
    FIFTH_PRIZE(5_000, "3개 일치"),
    FOURTH_PRIZE(50_000, "4개 일치"),
    THIRD_PRIZE(1_500_000, "5개 일치"),
    SECOND_PRIZE(30_000_000, "5개 일치, 보너스 볼 일치"),
    FIRST_PRIZE(2_000_000_000, "6개 일치"),
    NO_PRIZE(0, "상금이 없습니다.");

    private final int prize;
    private final String description;

    Prize(int prize, String description) {
        this.prize = prize;
        this.description = description;
    }

    public static Prize valueOf(int matchCount, boolean hasBonusMatch) {
        return switch (matchCount) {
            case 3 -> FIFTH_PRIZE;
            case 4 -> FOURTH_PRIZE;
            case 5 -> {
                if (hasBonusMatch)
                    yield SECOND_PRIZE;
                yield THIRD_PRIZE;
            }
            case 6 -> FIRST_PRIZE;
            default -> NO_PRIZE;
        };
    }

    public int getPrize() {
        return prize;
    }

    public String getDescription() {
        return description;
    }
}
