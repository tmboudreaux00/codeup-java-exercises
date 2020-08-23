
public class ServerNameGenerator {
    private String[] nouns = {"road","box","cloud","dog","dragon","squirrel","jug","tooth","fan","stone"};
    private String[] adjectives = {"round","red","jagged","blessed","cursed","feathery","long","bland","burned","ripe"};
    private String noun;
    private String adjective;
    private String serverName;

    private int nounRandomDouble(){
        double random;
        int randomInt = 0;
        int setLength = 0;
        do {
            if (nouns.length > setLength){
                setLength += 10;
                random = (Math.random() * setLength) - (setLength % nouns.length);
                randomInt = (int) random;
            } else {
                random = (Math.random() * 10) - (setLength % nouns.length);
            }
        } while (random > nouns.length);
        return randomInt;
    }


    public String getNoun(){
        return noun;
    }
    public void setNoun() {
        this.noun = nouns[nounRandomDouble()];
    }

    private int adjRandomDouble(){
        double random;
        int randomInt = 0;
        int setLength = 0;
        do {
            if (adjectives.length > setLength){
                setLength += 10;
                random = (Math.random() * setLength) - (setLength % adjectives.length);
                randomInt = (int) random;
            } else {
                random = (Math.random() * 10) - (setLength % adjectives.length);
            }
        } while (random > adjectives.length);
        return randomInt;
    }

    public void setAdjective(){
        this.adjective = adjectives[adjRandomDouble()];
    }
    public String getAdjective(){
        return adjective;
    }

    public String getServerName(){
        return serverName;
    }

    public void setServerName(String adj, String noun){
        this.serverName = "Server name is...\n" + adj + "-" + noun;
    }

    public static void main(String[] args) {
        ServerNameGenerator name = new ServerNameGenerator();
        name.setAdjective();
        name.setNoun();
        name.setServerName(name.getAdjective(), name.getNoun());
        System.out.println(name.getServerName());
    }
}