package step3.domain;

import java.util.ArrayList;
import java.util.List;

public class CarRacingGame {

    private List<Round> playedRounds = new ArrayList<>();

    public void gameStart(GameSetting gameSetting) {
        int carCount = gameSetting.getCarCount();
        int roundCount = gameSetting.getRoundCount();

        RacingCars cars = new RacingCars(carCount);
        playAllRounds(roundCount, cars);
    }

    private void playAllRounds(int roundCount, RacingCars cars) {
        for (int i = 0; i < roundCount; i++) {
            playOneRound(cars);
        }
    }

    private void playOneRound(RacingCars cars) {
        Round round = new Round();
        round.start(cars);

        playedRounds.add(round);
    }

    public List<Round> getPlayedRounds() {
        return playedRounds;
    }
}