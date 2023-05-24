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
        assertEquals("nahanut", ReverseWords.reverseWords("tunahan"));
    }

    @Test
    void testDivision2() {
        assertEquals("reenigne erawtfos ma i", ReverseWords.reverseWords("i am software engineer"));
    }

    @Test
    void testDivision3() {
        assertEquals("!kcul dooG", ReverseWords.reverseWords("Good luck!"));
    }

    @Test
    void testDivision4() {
        assertEquals("noitadilaV dna noitacifireV erawtfoS",
                ReverseWords.reverseWords("Software Verification and Validation"));
    }

    @Test
    void testDivision5() {
        assertEquals("fedcba", ReverseWords.reverseWords("abcdef"));
    }
}