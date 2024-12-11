// Cette fonction doit retourner un string au format "yyyy-mm-dd" ("année-mois-jour")
// Exemple : formatDate(new Date(2023, 11, 25)) doit retourner "2023-12-25"


//========================= TDD ============================

/**
 * Prend un objet Date et le transforme au format yyyy-MM-dd et retourne
 * une chaine de caractères
 * @param date Object Date
 * @return chaine de caractère sous format yyyy-MM-dd, ex : "2024-08-31"
 */
export function formatDate(date: Date) {
  // TODO :: fonction à implémenter
  return null;
}

/**
 * Prend une chaine de caractère en entrée au format yyyy-MM-dd pour en faire un
 * object Date.
 *
 * @param dateString chaine de caractère, ex : "2024-08-31"
 * @return object Date
 */
export function parseDate(dateString: String) {
  // TODO :: fonction à implémenter
  return null;
}

/**
   * Prend un objet Date et le transforme au format donné en entrée si ce dernier est valide
   * @param date Object Date
   * @param pattern le pattern de la date souhaité, ex : yyyy-MM-dd ou dd/MM/YYYY
   * @return chaine de caractère formaté avec le pattern en entrée ex : "31/08/2024
   */
export function formatDateWithPattern(date: Date, pattern: String) {
  // TODO :: fonction à implémenter
  return null;
}

//========================= Test par description ============================


/**
 * Prend un objet Date et le transforme au format yyyy-MM-ddThh:mm:ss et retourne
 * une chaine de caractères
 * @param date Object Date
 * @return chaine de caractère sous format yyyy-MM-ddThh:mm:ss, ex : "2024-08-31T08:46:00"
 */
export function formatDateTime(date: Date) {
  // TODO :: fonction à implémenter
  return null;
}


/**
 * Prend une chaine de caractère en entrée au format yyyy-MM-ddThh:mm:ss pour en faire un
 * object Date.
 *
 * @param dateTimeString chaine de caractère, ex : "2024-08-31T08:46:00"
 * @return object Date
 */
export function parseDateTime(dateString: String) {
  // TODO :: fonction à implémenter
  return null;
}



//========================= Test par code ============================

/**
 * Prend un objet Date et le transforme au format souhaité, tant que ce dernier est valide
 * @param dateTime Object Date
 * @param pattern le pattern de la Date souhaité, ex : yyyy-MM-ddThh:mm:ss
 * @return chaine de caractère formaté avec le pattern en entrée ex : "2024-08-31T08:46:00"
 */
export function formatDateTimeWithPattern(dateTime: Date, pattern: String) {
  if (!dateTime || !(dateTime instanceof Date)) {
    return null;
  }

  const year = dateTime.getFullYear();
  const month = ('0' + (dateTime.getMonth() + 1)).slice(-2);
  const day = ('0' + dateTime.getDate()).slice(-2);
  const hours = ('0' + dateTime.getHours()).slice(-2);
  const minutes = ('0' + dateTime.getMinutes()).slice(-2);
  const seconds = ('0' + dateTime.getSeconds()).slice(-2);

  const formattedDate = pattern.replace(/yyyy/g, year.toString())
    .replace(/MM/g, month)
    .replace(/dd/g, day)
    .replace(/hh/g, hours)
    .replace(/mm/g, minutes)
    .replace(/ss/g, seconds);

  return formattedDate;
}