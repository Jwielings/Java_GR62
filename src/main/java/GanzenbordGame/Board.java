package GanzenbordGame;

public class Board {

        public enum tileType {
            DEFAULT,
            GOOSE,
            BRIDGE,
            INN,
            WELL,
            MAZE,
            PRISON,
            DEATH
        }

        public tileType getTileType(int position) {
            return switch (position) {
                case 5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59 -> tileType.GOOSE;
                case 6 -> tileType.BRIDGE;
                case 19 -> tileType.INN;
                case 31 -> tileType.WELL;
                case 42 -> tileType.MAZE;
                case 52 -> tileType.PRISON;
                case 58 -> tileType.DEATH;
                default -> tileType.DEFAULT;
            };
        }
    }


