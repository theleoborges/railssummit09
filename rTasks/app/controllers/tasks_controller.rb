class TasksController < ApplicationController
  def index
    @tasks = AppContext.tasks_service.find_all
  end
end
