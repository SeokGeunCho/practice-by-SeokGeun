/*
✅ 1. 자바에서 자주 쓰는 정렬 알고리즘 6종 비교
정렬 알고리즘	  특징 요약	                  시간 복잡도(평균)	안정성

버블 정렬	    옆에 있는 것과 비교해서 교환 반복	  O(n²)	           안정 정렬
선택 정렬	    가장 작은 걸 찾아 맨 앞으로 이동	  O(n²)         	불안정
삽입 정렬  	앞에서부터 정렬된 영역에 삽입	  O(n²)         	안정 정렬
퀵 정렬	    피벗 기준으로 분할 → 재귀   	O(n log n)      	불안정
병합 정렬  	반으로 나눠서 병합하며 정렬  	O(n log n)      	안정 정렬
Timsort 	삽입정렬 + 병합정렬 혼합   	O(n log n)	          안정 정렬

✅ 2. 용어 정리
용어	                           설명
제자리 정렬 (In-place Sort)	추가 메모리 없이 배열 안에서만 정렬
안정 정렬 (Stable Sort)	    동일한 값을 가진 데이터의 기존 순서 유지됨

예: 이름 기준으로 정렬하되, 나이가 같으면 기존 순서 유지하는 게 중요할 때 → 안정 정렬 사용

✅ 3. Java의 Arrays.sort() 내부 동작

정렬 대상	                         사용하는 알고리즘	        특징
숫자 배열 (int[], double[])	    DualPivotQuickSort	빠르지만 불안정 정렬
객체 배열 (String[], Person[])	Timsort	           안정 정렬, 복잡도 보장

✏️ 왜 다르게 쓸까?
숫자 배열: 메모리 접근이 빠르고 비교가 간단 → 퀵 정렬 효율적
객체 배열: 비교 비용이 높고, 정렬 안정성이 중요 → Timsort가 더 안전하고 빠름

✅ 정리 요약 한 컷

[숫자 배열] Arrays.sort(int[]) → DualPivotQuickSort (빠름, 불안정)
[객체 배열] Arrays.sort(Object[]) → Timsort (안전함, 안정 정렬)

✅ 추천 사용법 (상황별)
상황	                      추천 정렬 방식
빠른 정렬 필요 (숫자)	     기본 Arrays.sort(int[])
객체 정렬 & 안정성 중요	     Arrays.sort(객체배열, Comparator)
리스트 정렬	             Collections.sort() 또는 .sort(Comparator)
직접 정렬 알고리즘 구현	     퀵 정렬 / 병합 정렬 추천
 */


package ArraysAlgorithm;

public class Outline {
}
