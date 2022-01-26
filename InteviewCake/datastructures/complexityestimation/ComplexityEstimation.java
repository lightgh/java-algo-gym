package datastructures.complexityestimation;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComplexityEstimation {
    public static void main(String[] args) {
        int[] tests = {0, 1, 2, 3, 4, 5, 10, 11, 12, 13, 14, 20, 21, 22, 23, 24, 100, 101, 102, 103, 104, 111, 112, 113, 114, 1000};
        for (int test : tests) {
            if( test == 0){
                System.out.println(0);
            }else {
                System.out.println(ordinal(test));
            }
        }

        int noOfDays = Period.between(LocalDate.of(2021, Month.NOVEMBER, 27), LocalDate.now()).getDays();

        System.out.println("No-Of-Days: " + noOfDays );
        int noOfDaysLeft = 14 - noOfDays;
        System.out.println("Days Remaining: " + noOfDaysLeft);

        System.out.println(LocalDate.now().plusDays(noOfDaysLeft).toString());

        System.out.println();

    }

    public static String ordinal(int i) {

        if( i == 0) {
            return "0";
        }

        String[] suffixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
        switch (i % 100) {
            case 11:
            case 12:
            case 13:
                return i + "th";
            default:
                return i + suffixes[i % 10];

        }
    }



//
//    List<String> processedAccessToken  = new ArrayList<>();
//
//    List<CandidateResultDetailsDto> resultDetailsDtoList = resultBatchEntryHistories
//            .stream()
//            .map(crbe -> {
//                CandidateResultDetailsDto candidateResultDetailsDto = new CandidateResultDetailsDto();
//                Candidate candidate = getCandidate(crbe.getRegistrationNumber(), crbe.getExam());
//                // check for subsequent checking of result in CandidateResultBatchToken
//                CandidateResultBatchToken resultBatchToken = getCandidateResultBatchToken(candidate.getId(), crbe.getCandidateResultBatchEntry().getBatchNumber());
//                if(resultBatchToken != null)
//                {
//                    System.out.println("get result-details using access-token in candidate_result_token");
//                    candidateResultDetailsDto = getCandidateResult(crbe, bearerAuthToken, resultBatchToken.getToken().getToken());
//                }
//                else{
//                    System.out.println("get result-details using access-token in access-token table");
//                    if (getTokenByLoggedInUser.size() < resultCheckCount)
//                        throw new AccessTokenCapacityException(resultCheckCount);
//
//
//                    // ===================================================
//
//
//
//                    Optional<UsedCandidateToken> accessToken = getTokenByLoggedInUser.stream().findFirst();
//
//                    if(firstUserCandidateAccessToken.isPresent() && !processedAccessToken.contains(accessToken.get())) {
//                            candidateResultDetailsDto = getCandidateResult(crbe, bearerAuthToken, accessToken.getToken());
//                            createCandidateResultBatchToken(candidate, accessToken, crbe.getCandidateResultBatchEntry());
//                            processedAccessedToken.add(accessToken);
//                            getTokenByLoggedInUser.remove(firstUserCandidateAccessToken.get());
//
//                    }
//                }
//
//                return candidateResultDetailsDto;
//
//            }).collect(Collectors.toList());


//    class UsedCandidateToken{
//        String usedToken;
//        Candidate candidate;
//
//    }


}
