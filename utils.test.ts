import { describe, it, expect } from "@jest/globals";
import { formatDate, parseDate, formatDateWithPattern, formatDateTime, parseDateTime, formatDateTimeWithPattern } from "./utils";

describe("formatDate", () => {

  //========================= Date ============================

  it("testFormatDate_ValidDate", () => {
    const date = new Date(2023, 9, 16); // October 16, 2023
    expect(formatDate(date)).toBe("2023-10-16");
  });

  it("testParseDate_ValidDate", () => {
    const date = "2023-01-05"; // January 5, 2023
    expect(parseDate(date)).toStrictEqual(new Date(2023, 0, 5));
  });

  it("testFormatDate_WithPattern", () => {
    const date = new Date(2024, 9, 28); // October 28, 2023
    expect(formatDate(date, "dd/MM/yyyy")).toBe("28/10/2024");
    expect(formatDate(date, "yyyy-MM-dd")).toBe("2024-10-28");
  });


  //========================= DateTime ============================
  it("testFormatDateTime_ValidDateTime", () => {
    // TODO :: test à implémenter
  });

  it("testParseDateTime_ValidDateTime", () => {
    // TODO :: test à implémenter
  });

  it("testFormatDateTime_WithPattern", () => {
    // TODO :: test à implémenter
  });

});
