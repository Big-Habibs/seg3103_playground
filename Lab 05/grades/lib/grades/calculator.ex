defmodule Grades.Calculator do

  # QUESTION 2.1 HELPER METHOD AVG
  def avg(homework, labs) do
    avg_homework =
      if Enum.count(homework) == 0 do
        0
      else
        Enum.sum(homework) / Enum.count(homework)
      end
    avg_labs =
      if Enum.count(labs) == 0 do
        0
      else
        Enum.sum(labs) / Enum.count(labs)
      end
     {avg_homework, avg_labs}
  end

  # QUESTION 2.2 HELPER METHOD FAILED_TO_PARTICIPATE?
  def failed_to_participate?(avg_homework, avg_exams, num_labs) do
    avg_homework < 0.4 || avg_exams < 0.4 || num_labs < 3
  end

  # QUESTION 2.3 HELPER METHOD CALCULATE_GRADE
  def calculate_grade(avg_homework, avg_labs, midterm, final) do
    0.2 * avg_labs + 0.3 * avg_homework + 0.2 * midterm + 0.3 * final
  end

  def percentage_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    {avg_homework, avg_labs} = avg(homework, labs)

    mark = calculate_grade(avg_homework, avg_labs, midterm, final)
    round(mark * 100)
  end

  # QUESTION 2.4 HELPER METHOD AVERAGE_EXAMS
  def average_exams(midterm, final) do
    (midterm + final) / 2
  end

  # QUESTION 2.4 HELPER METHOD NUMBER_OF_LABS
  def number_of_labs(labs) do
    labs
    |> Enum.reject(fn mark -> mark < 0.25 end)
    |> Enum.count()
  end

  def letter_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    {avg_homework, avg_labs} = avg(homework, labs)

    avg_exams = average_exams(midterm, final)

    num_labs = number_of_labs(labs)

    if failed_to_participate?(avg_homework, avg_exams, num_labs) do
      "EIN"
    else
      mark = calculate_grade(avg_homework, avg_labs, midterm, final)

      cond do
        mark > 0.895 -> "A+"
        mark > 0.845 -> "A"
        mark > 0.795 -> "A-"
        mark > 0.745 -> "B+"
        mark > 0.695 -> "B"
        mark > 0.645 -> "C+"
        mark > 0.595 -> "C"
        mark > 0.545 -> "D+"
        mark > 0.495 -> "D"
        mark > 0.395 -> "E"
        :else -> "F"
      end
    end
  end

  def numeric_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    {avg_homework, avg_labs} = avg(homework, labs)

    avg_exams = average_exams(midterm, final)

    num_labs = number_of_labs(labs)

    if failed_to_participate?(avg_homework, avg_exams, num_labs) do
      0
    else
      mark = calculate_grade(avg_homework, avg_labs, midterm, final)

      cond do
        mark > 0.895 -> 10
        mark > 0.845 -> 9
        mark > 0.795 -> 8
        mark > 0.745 -> 7
        mark > 0.695 -> 6
        mark > 0.645 -> 5
        mark > 0.595 -> 4
        mark > 0.545 -> 3
        mark > 0.495 -> 2
        mark > 0.395 -> 1
        :else -> 0
      end
    end
  end
end
