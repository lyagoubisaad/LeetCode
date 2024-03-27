package LeetCodeCategories.Heap_Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class L_355_DesignTwitter {

    HashMap<Integer, List<Integer>> followState = new HashMap<>();
    HashMap<Integer, List<Integer>> tweets = new HashMap<>();
    int timeOfTweet = 1;
    HashMap<Integer, Integer> tweetsTimer = new HashMap<>();
    public L_355_DesignTwitter() {
    }

    public void postTweet(int userId, int tweetId) {
        List<Integer> tweetList = new ArrayList<>(this.tweets.getOrDefault(userId, new ArrayList<>()));
        tweetList.add(tweetId);
        this.tweets.put(userId, tweetList);
        this.tweetsTimer.put(tweetId, timeOfTweet);
        timeOfTweet++;
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> followees = this.followState.get(userId);
        List<Integer> allTweets = new ArrayList<>();
        allTweets.addAll(this.tweets.getOrDefault(userId, new ArrayList<>()));
        if(followees != null) {
            for(int i=0;i<followees.size();i++) {
                allTweets.addAll(this.tweets.getOrDefault(followees.get(i), new ArrayList<>()));
            }
        }
        Collections.sort(allTweets, (tweetId1, tweetId2) -> {
            int timeOfTweet1 = tweetsTimer.get(tweetId1);
            int timeOfTweet2 = tweetsTimer.get(tweetId2);

            // Compare the timeOfTweet values in reverse order (from biggest to smallest)
            return Integer.compare(timeOfTweet2, timeOfTweet1);
        });
        int size = Math.min(10, allTweets.size());
        allTweets.subList(size, allTweets.size()).clear();
        return allTweets;
    }

    public void follow(int followerId, int followeeId) {
        List<Integer> followList = new ArrayList<>(this.followState.getOrDefault(followerId, new ArrayList<>()));
        if(!followList.contains(followeeId)) followList.add(followeeId);
        this.followState.put(followerId, followList);
    }

    public void unfollow(int followerId, int followeeId) {
        List<Integer> followList = new ArrayList<>(this.followState.getOrDefault(followerId, new ArrayList<>()));
        followList.remove(Integer.valueOf(followeeId));
        if(followList.size() == 0 && this.followState.get(followerId) != null) this.followState.remove(followerId);
        else this.followState.put(followerId, followList);
    }

    public static void main(String[] args) {
        L_355_DesignTwitter twitter = new L_355_DesignTwitter();
        twitter.postTweet(2, 5);
        twitter.follow(1, 2);
        twitter.follow(1, 2);
        twitter.getNewsFeed(1);
    }
}
