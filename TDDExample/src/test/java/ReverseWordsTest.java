/* B201202056 */
/* Tunahan Akça */
/* Software Verification and Validation */
/* HOMEWORK 1 */
/* https://github.com/tunhnakca/SOFTWARE-VERIFICATION-AND-VALIDATION */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDivision1() {
        assertEquals("Akca Tunahan", ReverseWords.reverseWords("Tunahan Akca"));
    }

    @Test
    void testDivision2() {
        assertEquals("engineer software am i", ReverseWords.reverseWords("i am software engineer"));
    }

    @Test
    void testDivision3() {
        assertEquals("luck! Good", ReverseWords.reverseWords("Good luck!"));
    }

    @Test
    void testDivision4() {
        assertEquals("Validation and Verification Software",
                ReverseWords.reverseWords("Software Verification and Validation"));
    }

    @Test
    void testDivision5() {
        assertEquals("JK Besiktas", ReverseWords.reverseWords("Besiktas JK"));
    }
}