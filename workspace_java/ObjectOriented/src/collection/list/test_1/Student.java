package collection.list.test_1;

public class Student {
    private String name;
    private int koreanScore;
    private int englishScore;
    private int totalScore;

    public Student(String name, int koreanScore, int englishScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.totalScore = koreanScore + englishScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKoreanScore(int koreanScore) {
        this.koreanScore = koreanScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", koreanScore=" + koreanScore +
                ", englishScore=" + englishScore +
                ", totalScore=" + totalScore +
                '}';
    }
}
