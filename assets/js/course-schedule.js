document.querySelectorAll(".course-schedule").forEach((schedule) => {
  const scheduleYear = Number(document.body.dataset.scheduleYear) || new Date().getFullYear();
  const today = new Date();
  today.setHours(0, 0, 0, 0);

  schedule.querySelectorAll("tbody tr").forEach((row) => {
    const firstCell = row.cells[0];
    const match = firstCell?.textContent.match(/(\d{1,2})\/(\d{1,2})\s*-\s*(\d{1,2})\/(\d{1,2})/);
    if (!match) return;

    const [, startMonth, startDay, endMonth, endDay] = match.map(Number);
    const start = new Date(scheduleYear, startMonth - 1, startDay);
    const endYear = endMonth < startMonth ? scheduleYear + 1 : scheduleYear;
    const end = new Date(endYear, endMonth - 1, endDay);

    if (today >= start && today <= end) {
      row.classList.add("is-current-week");
    } else if (today > end) {
      row.classList.add("is-past-week");
    }
  });
});