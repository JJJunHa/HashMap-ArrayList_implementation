package HashMap;

public interface Map3<K,V> {
	/**
	 * 입력받은 키 값에 해당하는 자료를 리스트에서 찾아 반환합니다.
	 * 입력한 키 값이 존재하지 않을 경우 null을 반환합니다.
	 * @param key 찾을 자료의 고유한 키 값
	 * @return 찾은 자료. 입력한 키 값이 존재하지 않을 경우 null을 반환합니다.
	 */
	V get(K key);
	/**
	 * 키 값을 입력 받아 자료를 저장합니다.
	 * 키 값과 자료를 매핑하여 리스트에 추가합니다.
	 * 만약 이미 존재하는 키 값이라면, 해당 자료를 덮어씌웁니다.
	 * @param key 저장할 자료의 고유한 키 값
	 * @param value 저장할 자료
	 */
    V put(K key, V value);
    /**
     * 객체의 상태를 문자열로 반환합니다.
     * 박스에 전체에 자료를 가져옵니다.
     * @return 객체의 상태를 나타내는 문자열
     */
    String toString();
    /**
     * 입력받은 키 값에 해당하는 자료를 리스트에서 제거합니다.
     * 입력받은 키 값에 해당하는 자료를 리스트에서 찾아 제거합니다.
     * 자료를 제거한 후에는 해당 자료를 반환합니다.
     * 입력한 키 값이 존재하지 않을 경우 null을 반환합니다.
     * @param key 제거할 자료의 고유한 키 값
     * @return 제거된 자료. 입력한 키 값이 존재하지 않을 경우 null을 반환합니다.
     */
    V remove(K key);
}
