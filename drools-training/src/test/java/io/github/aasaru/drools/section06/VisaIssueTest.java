/*
 *  Drools Online Course Sample Code and Study Materials (c) by Juhan Aasaru.
 *
 *  Drools Online Course Sample Code and Study Materials is licensed under a
 *  Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License.
 *
 *  You should have received a copy of the license along with this
 *  work. If not, see <http://creativecommons.org/licenses/by-nc-nd/4.0/>.
 */

package io.github.aasaru.drools.section06;

import static io.github.aasaru.drools.section08.FamilyVisaApplicationValidationTest.emulateInputFromKeyboard;

import org.junit.jupiter.api.Test;

class VisaIssueTest {

  @Test
  void shouldExecuteAllSteps() {
    VisaIssue.execute(1);
    VisaIssue.execute(2);
    VisaIssue.execute(3);
    VisaIssue.execute(4);

    emulateInputFromKeyboard("yes");
    VisaIssue.execute(5);

    VisaIssue.execute(6);
  }

}
