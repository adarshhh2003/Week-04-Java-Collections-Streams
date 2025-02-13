package com.votingsystem;

import java.util.*;

public class VotingSystem {
    // HashMap to store votes (Candidate -> Votes)
    private Map<String, Integer> votes = new HashMap<>();

    // TreeMap to display sorted results
    private Map<String, Integer> sortedVotes = new TreeMap<>();

    // LinkedHashMap to maintain order of votes
    private Map<String, Integer> orderedVotes = new LinkedHashMap<>();

    // Add vote for a candidate
    public void addVote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        orderedVotes.put(candidate, votes.get(candidate)); // Maintain insertion order
    }

    // Display results in sorted order (TreeMap)
    public void displayResults() {
        sortedVotes.putAll(votes); // Copy votes to TreeMap to sort them
        System.out.println("Results (Sorted by Candidate):");
        sortedVotes.forEach((candidate, voteCount) -> System.out.println(candidate + ": " + voteCount + " votes"));
    }

    // Display results in insertion order (LinkedHashMap)
    public void displayOrderedResults() {
        System.out.println("\nResults (Ordered by Insertion):");
        orderedVotes.forEach((candidate, voteCount) -> System.out.println(candidate + ": " + voteCount + " votes"));
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        // Simulating voting process
        system.addVote("Alice");
        system.addVote("Bob");
        system.addVote("Alice");
        system.addVote("Charlie");
        system.addVote("Bob");

        // Display results
        system.displayResults();
        system.displayOrderedResults();
    }
}
